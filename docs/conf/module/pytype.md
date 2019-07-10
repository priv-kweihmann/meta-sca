# Configuration for pytype

## Supported environments/languages

* python

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_pytype | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_PYTYPE_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_PYTYPE_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

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

 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Build Speed
 - ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* pytype.pytype.*

### Error considered as style issue

* n.a.