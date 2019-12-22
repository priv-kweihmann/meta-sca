# Configuration for multimetric

Within this module you can define metrics on many programming languages.
This module offers the possibility to issue a warning or an error if a configured threshold is exceeded.

## Supported environments/languages

* C
* C++
* Go
* PHP
* Perl
* Python
* Javascript
* Lua

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_multimetric | Blacklist filter for this tool | space-separated-list | ""
| SCA_MULTIMETRIC_ERROR_cyclomatic_complexity_gt | Threshold for maximum cyclomatic complexity before issuing an error | float-string | "30.0"
| SCA_MULTIMETRIC_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_MULTIMETRIC_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_MULTIMETRIC_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".c .C .c++ .cc .cp .cpp .CPP .cxx .go .h .H .h++ .hh .hpp .hxx .idc .js .jsm .lua .php .php3 .php4 .php5 .pl .pm .pxd .pxi .py .pyx .t .wlua"
| SCA_MULTIMETRIC_WARN_cyclomatic_complexity_gt | Threshold for maximum cyclomatic complexity before issuing a warning | float-string | "15.0"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Detailed configuration

To configure a threshold define a variable

**SCA_MULTIMETRIC_WARN_\<ID\>_gt** - for a warning when the value if greater than the threshold

**SCA_MULTIMETRIC_WARN_\<ID\>_lt** - for a warning when the value if less than the threshold

**SCA_MULTIMETRIC_ERROR_\<ID\>_gt** - for a warning when the value if greater than the threshold

**SCA_MULTIMETRIC_ERROR_\<ID\>_lt** - for a warning when the value if less than the threshold

## Known error-IDs

* multimetric.multimetric.comment_ratio = Comment to Code percentage
* multimetric.multimetric.cyclomatic_complexity = Cyclomatic complexity according to McCabe
* multimetric.multimetric.halstead_bugprop = Number of delivered bugs according to Halstead
* multimetric.multimetric.halstead_timerequired = Time required to program according to Halstead
* multimetric.multimetric.halstead_difficulty = Difficulty according to Halstead
* multimetric.multimetric.halstead_volume = Volume according to Halstead
* multimetric.multimetric.halstead_effort = Effort according to Halstead
* multimetric.multimetric.loc = Lines of code
* multimetric.multimetric.maintainability_index = Maintainability index
* multimetric.multimetric.operands_sum = Number of used operands
* multimetric.multimetric.operands_uniq = Number of unique used operands
* multimetric.multimetric.operators_sum = Number of used operators
* multimetric.multimetric.operators_uniq = Number of unique used operators

## Checking scope

* [ ] security
* [ ] functional defects
* [x] style issues

## Statistics

* ⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜ 03/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error considered as style issue

* multimetric.multimetric.*
