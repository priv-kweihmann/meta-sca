# Configuration for vulture

Vulture finds dead code in python code

## Supported environments/languages

* python

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[python] | Blacklist filter for this tool | space-separated-list | ""
| SCA_VULTURE_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_VULTURE_MIN_CONFIDENCE | Minimum confidence before reporting a finding | int:0-100 | "80"

## Supports

* [ ] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* vulture.vulture.deadcode
* vulture.vulture.syntaxerror

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 07/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* vulture.vulture.deadcode
* vulture.vulture.syntaxerror

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
