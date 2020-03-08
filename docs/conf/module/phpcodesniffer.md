# Configuration for phpcodesniffer

## Supported environments/languages

* PHP
* Javascript
* CSS

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_phpcodesniffer | Blacklist filter for this tool | space-separated-list | ""
| SCA_PHPCODESNIFFER_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_PHPCODESNIFFER_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_PHPCODESNIFFER_FILE_FILTER | File extensions to check | space-separated-list | ".php .js .css"

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
* [x] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Build Speed
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

* phpcodesniffer.phpcodesniffer.*
