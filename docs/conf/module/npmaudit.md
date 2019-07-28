# Configuration for npmaudit

## Supported environments/languages

* npm packages

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_npmaudit | Blacklist filter for this tool | space-separated-list | ""
| SCA_NPMAUDIT_EXTRA_SUPPRESS | Extra error-ids which should be suppressed | space-separated-list | ""
| SCA_NPMAUDIT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [x] requires online access

## Known error-ids

__tbd__

## Checking scope

- [x] security
- [ ] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Quality

## Score mapping

### Error considered as security relevant

* npmaudit.npmaudit.*

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.