# Configuration for goconst

## Supported environments/languages

* GO

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_goconst | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_GOCONST_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_GOCONST_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_GOCONST_EXTRA_ARGS | Additional arguments for goconst | space-separated-list | "-numbers"

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
* [ ] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* goconst.goconst.*
