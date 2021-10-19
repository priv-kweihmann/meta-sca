# Configuration for npmaudit

## Supported environments/languages

* npm packages

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_npmaudit | Blacklist filter for this tool | space-separated-list | ""
| SCA_NPMAUDIT_EXTRA_SUPPRESS | Extra error-IDs which should be suppressed | space-separated-list | ""
| SCA_NPMAUDIT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [x] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [x] security
* [ ] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Quality

## Score mapping

### Error considered as security relevant

* npmaudit.npmaudit.*

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
