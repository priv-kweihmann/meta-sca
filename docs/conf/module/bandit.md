# Configuration for bandit

## Supported environments/languages

* python

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BANDIT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_BANDIT_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_BLOCKLIST_bandit | Blacklist filter for this tool | space-separated-list | "linux-*"

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

* [x] security
* [ ] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* bandit.bandit.*

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
