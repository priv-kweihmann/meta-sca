# Configuration for setuptoolslint

## Supported environments/languages

* python

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[setuptoolslint] | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_SETUPTOOLSLINT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_SETUPTOOLSLINT_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_SETUPTOOLSLINT_LOCAL_PROXY | URL of fake local proxy, to prevent downloading any content | URL | "http://localhost:65533"
| SCA_SETUPTOOLSLINT_FILES | List of files to scan | space-separated list | "\${S}/setup.py"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

setuptoolslint.setuptoolslint.PackageNotFound

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* setuptoolslint.setuptoolslint.PackageNotFound

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
