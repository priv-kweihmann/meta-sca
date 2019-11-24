#ifndef PSCAN_H
#define PSCAN_H
/**********************************************************************
 * pscan: http://deployingradius.com/pscan/
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

#ifndef FALSE
#define FALSE (0)
#define TRUE (!FALSE)
#endif

#define PROBLEMATIC     TRUE
#define NOT_PROBLEMATIC FALSE

/*
 *  The maximum number of user-defined problem functions which may be
 *  read from a .pscan problem definition file.
 */
#define MAX_USER_PROBLEMS 2048

typedef struct problem_t {
  const char *function;
  int fmt_arg;
} problem_t;

typedef struct parser_state_t {
  const problem_t *problem;
  int line;			/* source file line at which we found
                                   the problem function */
  int args;			/* number of arguments used by the function */
  int constant_string;		/* is the last argument a constant string? */
  int last_token;		/* was the last token problematic, or not? */
  int braces;			/* the number of braces... */
} parser_state_t;
extern parser_state_t *state;

extern parser_state_t *pop_stack(void);
extern parser_state_t *push_stack(parser_state_t *current);
extern void check_function(parser_state_t *state);
extern parser_state_t *setup_checks(const char *yytext, parser_state_t *state);
#endif /* PSCAN_H */
