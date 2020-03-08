# Configuration for govet

govet module is the combination of go compiler and go vet.
It should catch almost all functional go related issues

## Supported environments/languages

* GO

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_govet | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_GOVET_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_GOVET_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_GOVET_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".go"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

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

* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* govet.govet.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
