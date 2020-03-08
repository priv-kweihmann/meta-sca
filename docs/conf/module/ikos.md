# Configuration for ikos

## Supported environments/languages

* C

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_ikos | Blacklist filter for this tool | space-separated-list | "linux-* busybox.*"
| SCA_IKOS_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_IKOS_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_IKOS_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".c"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

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

* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Build Speed
* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* ikos.ikos.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
