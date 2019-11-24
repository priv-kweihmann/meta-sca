/**********************************************************************
 * pscan: http://www.striker.ottawa.on.ca/~aland/pscan/
 *
 * Copyright (C) 2000,2007 Alan DeKok <aland@deployingradius.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA
 *
 **********************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>
#include <errno.h>
#include <assert.h>
#include <unistd.h>

#include "pscan.h"

extern int yylex();
extern int yylineno;
extern FILE *yyout, *yyin;

/*
 *  This function does nothing useful.
 */
int yywrap()
{
  return(1);
}

static int verbose = 0;
static int warnings = FALSE;
static char *filename;

#define FSM_MAX_STACK 8192
static parser_state_t fsm_stack[FSM_MAX_STACK];
static int stack_index = 0;
parser_state_t *state = NULL;

static int total_errors = 0;
static int total_warnings = 0;

/*
 *  The statically defined list of problem functions,
 *  common to most C libraries.
 */
static problem_t problem_functions[] = {
  { "vsprintf", 1},
  { "vfprintf", 1},
  { "vprintf", 0},
  { "vsnprintf", 2},
  { "snprintf", 2},
  { "sprintf", 1},
  { "fprintf", 1},
  { "fscanf", 1},
  { "printf", 0},
  { "scanf", 0},
  { "sscanf", 1},
  { "syslog", 1},
  { "setproctitle", 0},
  { "err", 1},
  { "verr", 1},
  { "errx", 1},
  { "verrx", 1},
  { "warn", 0},
  { "vwarn", 0},
  { "warnx", 0},
  { "vwarnx", 0},

  { NULL, 0}
};

/*
 *  User-supplied problem functions.
 *
 *  Yes, this is only a static buffer, but I'm too lazy to code
 *  a proper malloc/linked list replacement.  Sue me.  This works.
 */
static problem_t user_problem_functions[MAX_USER_PROBLEMS];
static int user_problems = 0;

/*
 *  Print out a usage string.
 */
static void usage(void)
{
  fprintf(stderr, "Usage: pscan [-vw] [-p problem_file] <files ...>\n");
  fprintf(stderr, "Attempts to discover a number of common security abuses in C source files.\n\n");
  fprintf(stderr, "  -v       Verbose mode.  Can be use multiple times for more output.\n");
  fprintf(stderr, "  -w       Show warnings when a variable is used as the format argument.\n");
  fprintf(stderr, "  -p file  Read additional problem <function,offset> definitions from <file>.\n");
  exit(1);
}

/*
 *  Read a problem file.  This consists of a function name,
 *  and an offset of the format string.
 */
void read_problem_file(const char *file)
{
  FILE *fp;
  char buffer[1024];
  char name[1024];
  int num, offset;
  int line;
  char *p;

  /*
   *  Can we open the file that they gave us?
   */
  fp = fopen(file, "r");
  if (!fp) {
    fprintf(stderr, "pscan: Error opening %s: %s\n",
	    file, strerror(errno));
    exit(1);
  }

  /*
   *  Loop over the input file
   */
  line = 0;
  while (fgets(buffer, sizeof(buffer), fp)) {
    line++;

    /*
     *  Sanity check the input buffer.
     */
    if (strchr(buffer, '\n') == NULL) {
      fprintf(stderr, "pscan: %s:%d: Input line too long\n", file, line);
      exit(1);
    }

    /*
     *  Ignore leading whitespace.
     */
    for (p = buffer; (*p == ' ') || (*p == '\t'); p++)
      /* nothing */;

    /*
     *  Skip blank lines and comments
     */
    if ((*p == '\n') || (*p == '#')) {
      continue;
    }

    /*
     *  Check for stupid buffer over-flows.
     */
    if (user_problems >= MAX_USER_PROBLEMS) {
      fprintf(stderr, "pscan: Too many user-defined problem functions.\n");
      exit(1);
    }

    /*
     *  Scan for the filename & line.
     */
    num = sscanf(buffer, "%s%d", name, &offset);
    if (num != 2) {
      fprintf(stderr, "pscan: %s:%d: Expected 2 parameters, got %d\n",
	      file, line, num);
      exit(1);
    }

    /*
     *  Copy the function/offset into our data structure.
     */
    user_problem_functions[user_problems].function = strdup(name);
    user_problem_functions[user_problems].fmt_arg = offset;
    user_problems++;
  }

  fclose(fp);
}

/*
 *  main, where everything happens.
 */
int main(int argc,char **argv)
{
  int i;
  int argval;

  /*
   *  Get command-line options.
   */
  while ((argval = getopt(argc, argv, "hp:vw")) != EOF) {
    switch (argval) {

    default:
    case 'h':
      usage();
      break;

    case 'v':
      verbose++;
      break;

    case 'w':
      warnings = TRUE;
      break;

    case 'p':
      read_problem_file(optarg);
      break;
    }
  }

  /*
   *  Sanity check arguments, to be sure there's at least one file we
   *  can open.
   */
  if (optind == argc) {
    usage();
  }

  /*
   *  Loop over the input files, scanning them for problems.
   */
  for (i = optind; i < argc; i++) {
    
    /*
     *  Initialize the stack, throwing away anything from the last file.
     */
    stack_index = 0;
    state = &fsm_stack[0];
    filename = argv[i];

    /*
     *  Initialize the current state.
     */
    state->problem = NULL;
    state->line = 0;
    state->args = -1;
    state->constant_string = -1;
    state->last_token = NOT_PROBLEMATIC;
    state->braces = 0;
    
    /* Open the source file for reading */
    if ((yyin = fopen(filename, "r")) == NULL) {
      fprintf(stderr, "pscan: Error opening %s: %s.\n", filename,
	      strerror(errno));
      printf("%s\n", strerror(errno));
      exit(1);
    }
    yyout = NULL;
    
    /*
     *  Initialize our variables.
     */
    yylineno = 1;
    
    if (verbose) {
      printf("Scanning %s ...\n", filename);
    }
    
    /*
     *  Let the lexer parse the whole file.
     */
    while (yylex())
      ;

    /* close the input file */
    fclose(yyin);
  }

  /*
   *  And finally, print out a summary of the total problems.
   */
  if (total_errors != 0) {
    if (verbose) {
      if (warnings) {
	printf("Warnings: %d\n", total_warnings);
      }
      printf("Total problems identified: %d\n", total_errors);

    }
    exit(1);
  }
  
  exit(0);
}

/*
 *  Check the number of arguments to the function, and was the LAST
 *  argument a constant string?
  */
void check_function(parser_state_t *state)
{
  assert(state != NULL);

  /*
   *  This was a reference to a function WITHOUT an opening brace,
   *  so it's not a function call.  Ignore it.
   */
  if (state->args < 0) {
    return;
  }

  if (verbose == 0) {
    /*
     *  The problem function has the SAME number of arguments as the
     *  placement of the format argument.  i.e. The LAST argument of the
     *  function is the format string.
     *
     *  If the last argument of the function is a constant string, then
     *  there can't be any security problems, so don't complain.
     *
     *  Otherwise, print out a complaint noting the source file,
     *  line number, and function name.
     */
    if ((state->problem->fmt_arg == state->args) &&
	(state->constant_string != state->problem->fmt_arg)) {
      printf("%s:%d SECURITY: %s call should have \"%%s\" as argument %d\n",
	     filename,
	     state->line,
	     state->problem->function,
	     state->problem->fmt_arg);
      total_errors++;

    } else if (warnings &&
	       (state->constant_string != state->problem->fmt_arg)) {
      printf("%s:%d Warning: %s uses non-constant string for format argument %d.\n",
	     filename,
	     state->line,
	     state->problem->function,
	     state->problem->fmt_arg);
      total_warnings++;
    }

  } else {
    /*
     *  verbose = 1, print out more stuff.
     */
    printf("%s:%d FUNC %s ", filename, state->line,
	   state->problem->function);
    if (state->problem->fmt_arg == state->args) {
      printf("Last argument is ");
      if (state->constant_string) {
	printf("constant string: OK\n");
      } else {
	printf("variable or reference: BAD\n");
	total_errors++;
      }
    } else {
      printf("format string with %d parameters: OK\n",
	     state->args - state->problem->fmt_arg);
    }
  }
}

/*
 *  Scan the current token to see if it's on the list of problem
 *  functions that we care about.
 */
parser_state_t *setup_checks(const char *name, parser_state_t *state)
{
  problem_t *problem;
  int i;

  /*
   *  If there are user-defined problems, use them FIRST.
   *
   *  This allows us to handle name conflicts with internally defined
   *  problem functions
   */
  if (user_problems != 0) {
    /*
     *  Loop over the list of problem functions, seeing if we have a match.
     */
    for (i = 0; i < user_problems; i++) {
      problem = &user_problem_functions[i];

      /*
       *  We have a match!  Set up the current stack, and return.
       */
      if (strcmp(problem->function, name) == 0) {

	/*
	 *  Ignore user-defined problems with -1 as a format parameter.
	 */
	if (problem->fmt_arg == -1) {
	  return state;
	}

	if (state->last_token == PROBLEMATIC) {
	  state = push_stack(state);
	}
	
	state->problem = problem;
	state->line = yylineno;
	state->braces = 0;
	state->args = -1;
	state->constant_string = -1;
	state->last_token = PROBLEMATIC;
	return state;
      }
    } /* end of loop over user defined problems */
  } /* end of any user defined problems */

  /*
   *  Loop over the list of problem functions, seeing if we have a match.
   */
  for (problem = &problem_functions[0]; problem->function != NULL; problem++) {

    /*
     *  We have a match!  Set up the current stack, and return.
     */
    if (strcmp(problem->function, name) == 0) {
      if (state->last_token == PROBLEMATIC) {
	state = push_stack(state);
      }

      state->problem = problem;
      state->line = yylineno;
      state->braces = 0;
      state->args = -1;
      state->constant_string = -1;
      state->last_token = PROBLEMATIC;
      return state;
    }
  }

  return state;
}

/*
 *  Pop an entry off of the stack, and return it to the caller.
 */
parser_state_t *pop_stack(void)
{
  assert(stack_index >= 0);

  /*
   *  This works around stupid state thingies.
   */
  if (stack_index == 0) {
    return &fsm_stack[stack_index];
  }

  stack_index--;
  return &fsm_stack[stack_index];
}

/*
 *  Push an entry onto the stack, and return a new entry to use.
 */
parser_state_t *push_stack(parser_state_t *state)
{
  assert(state == &fsm_stack[stack_index]);
  assert(stack_index < FSM_MAX_STACK);

  stack_index++;
  return &fsm_stack[stack_index];
}
