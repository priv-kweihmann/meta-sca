# Configuration for govet

govet module is the combination of go compiler and go vet.
It should catch almost all functional go related issue

## Supported environments/languages

* GO

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_govet | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_GOVET_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_GOVET_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_GOVET_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".go"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [ ] requires online access

## Known error-ids

__tbd__

## Checking scope

- [ ] security
- [x] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* govet.govet.*

### Error considered as style issue

* n.a.
