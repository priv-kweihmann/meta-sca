# Configuration for flake8

## Supported environments/languages

* python

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[flake8] | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_FLAKE8_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_FLAKE8_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Notes

For python2 and python3 installations the following plugins are enabled

* flake8-comprehensions
* flake8-eradicate
* flake8-mutable
* flake8-quotes
* flake8-string-format

in python3 installations in addition following plugins are available

* flake8-executable

with python 3.6+ the following plugins are available

* flake8-fixme
* flake8-strict

## Known error-IDs

__tbd__

## Checking scope

* [x] security
* [x] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Quality

## Score mapping

### Error considered as security relevant

* flake8.flake.EXE.*

### Error considered as functional defect

* flake8.flake.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
