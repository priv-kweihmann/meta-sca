# Configuration for phpcodefixer

## Supported environments/languages

* PHP

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_phpcodefixer | Blacklist filter for this tool | space-separated-list | ""
| SCA_PHPCODEFIXER_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_PHPCODEFIXER_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_PHPCODEFIXER_FILE_FILTER | File extensions to check | space-separated-list | ".php"
| SCA_PHPCODEFIXER_PHP_VERSION | Explicitly set a PHP version to check against. Leave empty for auto-detect | version string in format x.y or empty | ""

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [x] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [x] security
* [ ] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* phpcodefixer.phpcodefixer.*

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
