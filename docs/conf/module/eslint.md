# Configuration for eslint

## Supported environments/languages

* javascript
* embedded javascript

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_eslint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_ESLINT_CONFIG_FILE | Configuration-file to be used. See recipe eslint-native for details | string: eslint-standard.json, eslint-plain.json, eslint-airbnb.json, eslint-google.json | eslint-plain.json
| SCA_ESLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_ESLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

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
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* eslint.eslint.*

### Error considered as style issue

* n.a.