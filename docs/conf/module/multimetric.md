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
| SCA_BLOCKLIST[multimetric] | Blacklist filter for this tool | space-separated-list | ""
| SCA_MULTIMETRIC_COMPILER_MODULES | List of modules that are generating compiler warnings | space-separated-list | "gcc"
| SCA_MULTIMETRIC_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_MULTIMETRIC_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_MULTIMETRIC_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".c .C .c++ .cc .cp .cpp .CPP .cxx .go .h .H .h++ .hh .hpp .hxx .idc .js .jsm .lua .php .php3 .php4 .php5 .pl .pm .pxd .pxi .py .pyx .t .wlua"
| SCA_MULTIMETRIC_IMAGE_KEY | Input key on which the image metrics are calculated | enum: mean, median, max, min, sd | "mean"


### Default values

Following metric are set by default

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_MULTIMETRIC_ERROR_maintainability_index_lt | Create an error if maintainability_index is less than value | float-string | "50.0"
| SCA_MULTIMETRIC_ERROR_tiobe_lt | Create an error if tiobe is less than value | float-string | "50.0"
| SCA_MULTIMETRIC_WARN_maintainability_index_lt | Create a warning if maintainability_index is less than value | float-string | "80.0"
| SCA_MULTIMETRIC_WARN_pylint_lt | Create a warning if pylint is less than value | float-string | "70.0"
| SCA_MULTIMETRIC_WARN_tiobe_lt | Create a warning if tiobe is less than value | float-string | "80.0"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [x] available in SDK
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

* multimetric.multimetric.comment_ratio
* multimetric.multimetric.cyclomatic_complexity
* multimetric.multimetric.fanout_external
* multimetric.multimetric.fanout_internal
* multimetric.multimetric.halstead_bugprop
* multimetric.multimetric.halstead_difficulty
* multimetric.multimetric.halstead_effort
* multimetric.multimetric.halstead_timerequired
* multimetric.multimetric.halstead_volume
* multimetric.multimetric.loc
* multimetric.multimetric.maintainability_index
* multimetric.multimetric.operands_sum
* multimetric.multimetric.operands_uniq
* multimetric.multimetric.operators_sum
* multimetric.multimetric.operators_uniq
* multimetric.multimetric.pylint
* multimetric.multimetric.tiobe_compiler
* multimetric.multimetric.tiobe_complexity
* multimetric.multimetric.tiobe_coverage
* multimetric.multimetric.tiobe_duplication
* multimetric.multimetric.tiobe_fanout`          
* multimetric.multimetric.tiobe_functional
* multimetric.multimetric.tiobe_security
* multimetric.multimetric.tiobe_standard
* multimetric.multimetric.tiobe

## Checking scope

* [ ] security
* [ ] functional defects
* [ ] compliance
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

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* multimetric.multimetric.*
