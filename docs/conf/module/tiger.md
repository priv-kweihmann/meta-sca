# Configuration for tiger

## Supported environments/languages

* image

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST_tiger | Blacklist filter for this tool | space-separated-list | ""
| SCA_TIGER_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_TIGER_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [ ] run on recipe
* [x] run on image
* [ ] available in SDK
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
* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* tiger.tiger.*

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
