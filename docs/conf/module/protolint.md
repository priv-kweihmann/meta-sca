# Configuration for protolint

## Supported environments/languages

* GO

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST_protolint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_PROTOLINT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_PROTOLINT_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_PROTOLINT_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".proto"

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

__tbd__

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Build Speed
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

* protolint.protolint.*
