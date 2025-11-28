# Configuration for licensecheck

## Supported environments/languages

* licensing

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[licensecheck] | Blacklist filter for this tool | space-separated-list | ""
| SCA_LICENSECHECK_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_LICENSECHECK_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [ ] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* licensecheck.licensecheck.license - A non matching LICENSE setting was detected

## Checking scope

* [ ] security
* [ ] functional defects
* [x] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Build Speed
* ⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜ 03/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error considered as compliance issue

* licensecheck.licensecheck.*

### Error considered as style issue

* n.a.
