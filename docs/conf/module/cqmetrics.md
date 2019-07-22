# Configuration for cqmetrics

Within this module you can define metrics on any C/C++ source code.
This module offers the possibility to issue a warning or an error if a configured threshold is exceeded.

## Supported environments/languages

* C
* C++
* metrics

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_cqmetrics | Blacklist filter for this tool | space-separated-list | ""
| SCA_CQMETRICS_ERROR_cyclomatic_max_gt | Threshold for maximum cyclomatic complexity before issuing an error | float-string | "30.0"
| SCA_CQMETRICS_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_CQMETRICS_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_CQMETRICS_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".c .cpp .h .hpp"
| SCA_CQMETRICS_WARN_cyclomatic_max_gt | Threshold for maximum cyclomatic complexity before issuing a warning | float-string | "15.0"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [ ] requires online access

## Detailed configuration

To configure a threshold define a variable

**SCA_CQMETRICS_WARN_\<ID\>_gt** - for a warning when the value if greater than the threshold

**SCA_CQMETRICS_WARN_\<ID\>_lt** - for a warning when the value if less than the threshold

**SCA_CQMETRICS_ERROR_\<ID\>_gt** - for a warning when the value if greater than the threshold

**SCA_CQMETRICS_ERROR_\<ID\>_lt** - for a warning when the value if less than the threshold

## Known error-ids

 * cyclomatic_max - Cyclomatic complexity maximum
 * cyclomatic_mean - Cyclomatic complexity mean
 * cyclomatic_median - Cyclomatic complexity median
 * cyclomatic_min - Cyclomatic complexity minimum
 * cyclomatic_sd - Cyclomatic complexity standard deviation
 * halstead_max - Halstead complexity per function maximum
 * halstead_mean - Halstead complexity per function mean
 * halstead_median - Halstead complexity per function median
 * halstead_min - Halstead complexity per function minumum
 * halstead_sd - Halstead complexity per function standard
 * identifier_length_max - Identifier length maximum
 * identifier_length_mean - Identifier length mean
 * identifier_length_median - Identifier length median
 * identifier_length_min - Identifier length minimum
 * identifier_length_sd - Identifier length standard deviation
 * indentation_spacing_count - Spaces used for one level of indentation
 * indentation_spacing_max - Spaces used for one level of indentation maximum
 * indentation_spacing_mean - Spaces used for one level of indentation mean
 * indentation_spacing_median - Spaces used for one level of indentation median
 * indentation_spacing_min - Spaces used for one level of indentation minimum
 * indentation_spacing_sd - Spaces used for one level of indentation standard deviation
 * line_length_max - Line length maximum
 * line_length_mean - Line length mean
 * line_length_median - Line length median
 * line_length_min - Line length minimum
 * line_length_sd - Line length standard deviation
 * nboilerplate_comment_char - Number of boilerplate/license comment characters
 * nchar - Number of characters
 * ncomment - Number of comments
 * ncomment_char - Number of comment characters
 * nconst - Number of const keywords
 * ncpp_conditional - Number of C preprocessor conditional directives #if, #ifdef, #elif
 * ncpp_directive - Number of C preprocessor directives
 * ncpp_include - Number of C preprocessor include directives
 * ndox_comment - Number of DOxygen comments
 * ndox_comment_char - Number of DOxygen comment characters
 * nempty_line - Number of empty lines
 * nenum - Number of enum keywords
 * nfun_comment - Number of comments inside function bodies
 * nfun_cpp_conditional - Number of C preprocessor conditional directives in function bodies
 * nfun_cpp_directive - Number of C preprocessor directives in function bodies
 * nfunction - Number of functions Halstead complexity
 * nfunction2 - Number of functions cyclomatic complexity
 * ngoto - Number of goto statements
 * nidentifier - Identifier length
 * ninline - Number of inline keywords
 * ninternal - Number of declarations with internal linkage static visibility
 * nline - Number of lines
 * nno_space_after_binary_op - Number of occurences of no space after binary operator
 * nno_space_after_closing_brace - Number of occurences of no space after closing brace
 * nno_space_after_comma - Number of occurences of no space after comma
 * nno_space_after_keyword - Number of occurences of no space after keyword
 * nno_space_after_opening_brace - Number of occurences of no space after opening brace
 * nno_space_after_opening_square_bracket - Number of occurences of no space after opening square bracket
 * nno_space_after_semicolon - Number of occurences of no space after semicolon
 * nno_space_after_struct_op - Number of occurences of no space after struct operator
 * nno_space_after_unary_op - Number of occurences of no space after unary operator
 * nno_space_before_binary_op - Number of occurences of no space before binary operator
 * nno_space_before_closing_brace - Number of occurences of no space before closing brace
 * nno_space_before_closing_bracket - Number of occurences of no space before closing bracket
 * nno_space_before_closing_square_bracket - Number of occurences of no space before closing square bracket
 * nno_space_before_comma - Number of occurences of no space before comma
 * nno_space_before_keyword - Number of occurences of no space before keyword
 * nno_space_before_opening_brace - Number of occurences of no space before opening brace
 * nno_space_before_opening_square_bracket - Number of occurences of no space before opening square bracket
 * nno_space_before_semicolon - Number of occurences of no space before semicolon
 * nno_space_before_struct_op - Number of occurences of no space before struct operator
 * nnoalias - Number of noalias keywords
 * nregister - Number of register keywords
 * nrestrict - Number of restrict keywords
 * nsigned - Number of signed keywords
 * nspace_after_binary_op - Number of occurences of space after binary operator
 * nspace_after_closing_brace - Number of occurences of space after closing brace
 * nspace_after_comma - Number of occurences of space after comma
 * nspace_after_keyword - Number of occurences of space after keyword
 * nspace_after_opening_brace - Number of occurences of space after opening brace
 * nspace_after_opening_square_bracket - Number of occurences of space after opening square bracket
 * nspace_after_semicolon - Number of occurences of space after semicolon
 * nspace_after_struct_op - Number of occurences of space after struct operator
 * nspace_after_unary_op - Number of occurences of space after unary operator
 * nspace_at_end_of_line - Number of occurences of space at end of line
 * nspace_before_binary_op - Number of occurences of space before binary operator
 * nspace_before_closing_brace - Number of occurences of space before closing brace
 * nspace_before_closing_bracket - Number of occurences of space before closing bracket
 * nspace_before_closing_square_bracket - Number of occurences of space before closing square bracket
 * nspace_before_comma - Number of occurences of space before comma
 * nspace_before_keyword - Number of occurences of space before keyword
 * nspace_before_opening_brace - Number of occurences of space before opening brace
 * nspace_before_opening_square_bracket - Number of occurences of space before opening square bracket
 * nspace_before_semicolon - Number of occurences of space before semicolon
 * nspace_before_struct_op - Number of occurences of space before struct operator
 * nstatement - Number of statements
 * nstruct - Number of struct keywords
 * ntypedef - Number of typedef keywords
 * nunion - Number of union keywords
 * nunsigned - Number of unsigned keywords
 * nvoid - Number of void keywords
 * nvolatile - Number of volatile keywords
 * statement_nesting_max  - Nested statements maximum
 * statement_nesting_mean - Nested statements mean
 * statement_nesting_median  - Nested statements median
 * statement_nesting_min - Nested statements minimum
 * statement_nesting_sd  - Nested statements standard deviation
 * style_inconsistency - Style inconsistency
 * unique_identifier_length_max - Unique identifier length maximum
 * unique_identifier_length_mean - Unique identifier length mean
 * unique_identifier_length_median - Unique identifier length median
 * unique_identifier_length_min - Unique identifier length minimum
 * unique_identifier_length_sd - Unique identifier length standard deviation
 * unique_nidentifier - Unique identifier length

## Checking scope

- [ ] security
- [ ] functional defects
- [x] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error considered as style issue

* cqmetrics.cqmetrics.*