# Configuration for wotan

## Supported environments/languages

* javascript

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_wotan | Blacklist filter for this tool | space-separated-list | ""
| SCA_WOTAN_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_WOTAN_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_WOTAN_FILE_FILTER | File extension to scan for | space-separated-list | ".js .ts .vue"
| SCA_WOTAN_CONFIG | Configuratio preset to use | space-separated-list | "wotan:recommended"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [x] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [x] requires online access

## Known error-ids

__tbd__

## Checking scope

- [ ] security
- [x] functional defects
- [x] style issues

## Statistics

 - ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* wotan.wotan.*

### Error considered as style issue

* n.a.