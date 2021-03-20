# Configuration for checksec

## Supported environments/languages

* image

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_checksec | Blacklist filter for this tool | space-separated-list | ""
| SCA_CHECKSEC_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_CHECKSEC_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_CHECKSEC_CHECKS | Checks to perform | space-separated-list | "canary nx pie relro rpath safestack symbols"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [ ] run on recipe
* [x] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* checksec.checksec.canary
* checksec.checksec.nx
* checksec.checksec.pie
* checksec.checksec.relro
* checksec.checksec.rpath
* checksec.checksec.safestack
* checksec.checksec.symbols

## Checking scope

* [x] security
* [ ] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* checksec.checksec.*

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
