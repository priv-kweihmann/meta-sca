# Configuration for oclint

## Supported environments/languages

* C
* C++

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_oclint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_OCLINT_ADD_INCLUDES | List of additional include paths | space-separated-list | ""
| SCA_OCLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_OCLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_OCLINT_FILE_FILTER | List of file extensions to check | space-separated-list | ".c .cpp"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image

## Requires

- [x] requires online access

## Known error-ids

__tbd__

## Checking scope

- [ ] security
- [x] functional defects
- [ ] style issues

## Statistics

 - ⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜ 01/10 Build Speed
 - ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* oclint.oclint.*

### Error considered as style issue

* n.a.