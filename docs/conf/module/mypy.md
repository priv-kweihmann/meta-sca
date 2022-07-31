# Configuration for mypy

## Supported environments/languages

* python

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST_mypy | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_MYPY_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_MYPY_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [x] run on image
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

* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* mypy.mypy.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
