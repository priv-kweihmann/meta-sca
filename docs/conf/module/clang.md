# Configuration for clang

## Supported environments/languages

* C
* C++

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_clang | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_CLANG_ADD_INCLUDES | List of additional include paths | space-separated-list | ""
| SCA_CLANG_CHECKERS | List of clang-tidy checkers to execute | space-separated-list | see sca-clang.bbclass for details
| SCA_CLANG_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_CLANG_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_CLANG_FILE_FILTER | List of file extensions to check | space-separated-list | ".c .cpp"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [ ] requires online access

## Known error-ids

__tbd__

## Checking scope

- [ ] security
- [x] functional defects
- [ ] style issues

## Statistics

 - ⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜ 01/10 Build Speed
 - ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* clang.clang.*

### Error considered as style issue

* n.a.