# Configuration for looong

## Supported environments/languages

* python

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[looong] | Blacklist filter for this tool | space-separated-list | "linux-.*"
| SCA_LOOONG_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_LOOONG_ERR_THRESHOLD | If arg-list lenght exceeds this value issue an error instead of warning | int | "8"

## Supports

* [ ] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* looong.looong.TooLongArgumentList - argument list of a function is too long

## Checking scope

* [ ] security
* [ ] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* looong.looong.*
