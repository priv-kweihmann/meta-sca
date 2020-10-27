# Configuration for eslint

## Supported environments/languages

* javascript
* embedded javascript

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_eslint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_ESLINT_CONFIG_FILE | Configuration-file to be used. See recipe eslint-native for details | string: eslint-plain.json or file name | eslint-plain.json
| SCA_ESLINT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_ESLINT_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_ESLINT_FILE_FILTER | File extensions to check for | space-separated-list | ".js .vue .html .htm"

### Notes

You can supply your own configuration by installing a premade json file into `${STAGING_DATADIR_NATIVE}/eslint/configs/` and reference the file name via `SCA_ESLINT_CONFIG_FILE` option

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [x] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* eslint.eslint.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
