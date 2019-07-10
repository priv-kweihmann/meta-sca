# Configuration for flint++

## Supported environments/languages

* C
* C++

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_flint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_FLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_FLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_FLINT_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".c .cpp .h .hpp"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image

## Requires

- [ ] requires online access

## Known error-ids

__tbd__

## Checking scope

- [ ] security
- [x] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* flint.flint.*

### Error considered as style issue

* n.a.