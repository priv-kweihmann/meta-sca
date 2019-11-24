%option yylineno

%{
#include "pscan.h"
static void skip_strings(char literal);
%}

%x comment
%x strings
  
reserved    "default"|"struct"|"void"|"for"|"if"|"else"|"while"|"do"|"return"|"case"|"switch"|"break"|"auto"|"continue"|"goto"|"sizeof"|"static"|"typedef"|"union"|"volatile"

vartype "char"|"double"|"enum"|"extern"|"float"|"int"|"long"|"register"|"short"|"signed"|"unsigned"|"const"      

cprep "include"|"define"|"if"|"else"|"endif"|"ifdef"|"ifndef"

%%
{reserved}                            state->last_token = NOT_PROBLEMATIC;

{vartype}                             state->last_token = NOT_PROBLEMATIC;


"#"{cprep}                            state->last_token = NOT_PROBLEMATIC;

NULL				      { if ((state->last_token == PROBLEMATIC) &&
                                          (state->constant_string < 0)) {
                                         state->constant_string = state->args;
                                         }
                                       }

\"                                    {
                                          if (state->last_token == PROBLEMATIC) {
                                          if (state->constant_string < 0) {
                                          state->constant_string = state->args;
                                          }
}
                                          skip_strings('"');
                                      }

\'                                    skip_strings('\'');

\/\/.*$                               /* skip C++ style comments */

[a-zA-Z_][_a-zA-Z0-9]*                state = setup_checks(yytext, state);

[ \t]+                                /* eat up whitespace */

\(                                    {
                                        if (state->args < 0) state->args = 0;
                                        state->braces++;
                                        if (state->braces > 1) {
                                          state = push_stack(state);
                                          state->last_token = NOT_PROBLEMATIC;
                                          state->braces = 1;
                                          state->args = -1;
                                        }
                                      }

\,                                    if (state->last_token == PROBLEMATIC) {
                                        if (state->braces != 0) {
                                          state->args++;
                                        } else {
                                          state->last_token = NOT_PROBLEMATIC;
                                        }
                                      }

\)                                    if (state->last_token == PROBLEMATIC) {
                                        check_function(state);
                                        state->last_token = NOT_PROBLEMATIC;
                                      } else if (state->braces != 0) {
                                        state->braces--;
                                        if (state->braces == 0) {
                                          state = pop_stack();
                                        }
                                      }

.                                     {
                                        if ((state->last_token == PROBLEMATIC) &&
                                             (state->braces == 0)) {
                                          state->last_token = NOT_PROBLEMATIC;
                                        }
                                      }

                                      
"\n"|"\r"          		      /* ignore LF's and CR's */


"/*"    BEGIN(comment);

<comment>[^*\n]*        /* eat anything that's not a '*' */
<comment>"*"+[^*/\n]*   /* eat up '*'s not followed by '/'s */
<comment>\n             /* do nothing */
<comment>"*"+"/"        BEGIN(INITIAL);

%%
/**********************************************************************
 * pscan: http://www.striker.ottawa.on.ca/~aland/pscan/
 *
 * Copyright (C) 2000 Alan DeKok <aland@ox.org>
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
static const char rcsid[] = "$Id: scanner.l,v 1.4 2000/07/17 18:51:45 aland Exp $";

/* static */
void skip_strings(char literal)
{
       int c;

       while ((c = input()) != literal)
           {
           switch (c) {
            
           case '\\':
                      c = input(); 
                      if (c == '\\') continue;
                      if (c == EOF) return;
                      if (c != literal)
                        unput(c);
                      break;
           case EOF:
                return;

           default:
                      break;
            }
          }
}
