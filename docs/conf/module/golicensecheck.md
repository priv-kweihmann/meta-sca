# Configuration for golicensecheck

## Supported environments/languages

* licensing

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_golicensecheck | Blacklist filter for this tool | space-separated-list | ""
| SCA_LICENSECHECK_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_LICENSECHECK_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_GOLICENSECHECK_MIN_CONFIDENCE | Minimum confidence about the license | float: 0.0-1.0 | "0.9"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* golicensecheck.golicensecheck.license - A non matching LICENSE setting was detected

## Checking scope

* [ ] security
* [ ] functional defects
* [x] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error considered as compliance issue

* golicensecheck.golicensecheck.*

### Error considered as style issue

* n.a.
