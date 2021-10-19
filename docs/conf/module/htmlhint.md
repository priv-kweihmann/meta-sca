# Configuration for htmlhint

## Supported environments/languages

* HTML

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_htmlhint | Blacklist filter for this tool | space-separated-list | ""
| SCA_HTMLHINT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_HTMLHINT_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""

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

* htmlhint.htmlhint.tag-pair
* htmlhint.htmlhint.spec-char-escape
* htmlhint.htmlhint.id-unique

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* htmlhint.htmlhint.*
