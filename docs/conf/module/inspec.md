# Configuration for inspec

## Supported environments/languages

* image

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_inspec | Blacklist filter for this tool | space-separated-list | ""
| SCA_INSPEC_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_INSPEC_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_INSPEC_MODULES | Modules to check | space-separated-list | see `sca-inspec-config.bbclass` for details

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [ ] run on recipe
* [x] run on image
* [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [x] security
* [ ] functional defects
* [x] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Build Speed
* ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* inspec.inspec.*

### Error considered as style issue

* n.a.
