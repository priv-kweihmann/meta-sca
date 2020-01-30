# Configuration for pyfindinjection

## Supported environments/languages

* python

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_pyfindinjection | Blacklist filter for this tool | space-separated-list | ""
| SCA_PYFINDINJECTION_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_PYFINDINJECTION_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [x] security
* [ ] functional defects
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Quality

## Score mapping

### Error considered as security relevant

* pyfindinjection.pyfindinjection.*

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.
