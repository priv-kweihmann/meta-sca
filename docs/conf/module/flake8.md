# Configuration for flake8

## Supported environments/languages

* python

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_flake8 | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_FLAKE8_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_FLAKE8_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [x] run on image

## Requires

- [ ] requires online access

## Notes

For python2 and python3 installations the following plugins are enabled

 * flake8-comprehensions
 * flake8-eradicate
 * flake8-import-order
 * flake8-mutable
 * flake8-quotes
 * flake8-string-format

in python3 installations in addition following plugins are available

 * flake8-executable

with python 3.6+ the following plugins are avialable

 * flake8-fixme
 * flake8-strict

## Known error-ids

__tbd__

## Checking scope

- [x] security
- [x] functional defects
- [x] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* flake8.flake.EXE.*

### Error considered as functional defect

* flake8.flake.*

### Error considered as style issue

* n.a.
