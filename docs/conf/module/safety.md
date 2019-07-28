# Configuration for safety

## Supported environments/languages

* python packaging

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_safety | Blacklist filter for this tool | space-separated-list | ""
| SCA_SAFETY_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_SAFETY_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [ ] requires online access

## Notes

Currently only the free [Safety DB](https://github.com/pyupio/safety-db) is supported. The paid [Safety API](https://github.com/pyupio/safety/blob/master/docs/api_key.md) maybe added later.

## Known error-ids

safety.safety.vulnerability - a vulnerability was detected in referenced packages

## Checking scope

- [x] security
- [ ] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* safety.safety.vulnerability

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.