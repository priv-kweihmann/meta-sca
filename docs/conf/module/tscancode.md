# Configuration for tscancode

## Supported environments/languages

* C
* C#
* lua

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[tscancode] | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_TSCANCODE_CONFIG_FILES | Files to check for configuration symbols (header or KConfig) | space-separated-list | ".config config.h"
| SCA_TSCANCODE_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_TSCANCODE_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_TSCANCODE_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".cpp .cxx .cc .c++ .c .tpp .txx"
| SCA_TSCANCODE_INCLUDE_PATHS | Extra include paths **WARNING: this will heavily slow down thw check** | space-separated-list | ""
| SCA_TSCANCODE_SYMBOL_PREFIX | Prefix found symbols with | string | "ENABLE_"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* tscancode.tscancode.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
