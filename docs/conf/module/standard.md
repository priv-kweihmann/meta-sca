# Configuration for standard

## Supported environments/languages

* JavaScript

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_standard | Blacklist filter for this tool | space-separated-list | ""
| SCA_STANDARD_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_STANDARD_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_STANDARD_FILE_FILTER | File extension to scan for | space-separated-list | ".js .jsx"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [x] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* standard.standard.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
