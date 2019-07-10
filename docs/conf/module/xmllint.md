# Configuration for xmllint

## Supported environments/languages

* xmllint

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_xmllint | Blacklist filter for this tool | space-separated-list | ""
| SCA_XMLLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_XMLLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_XMLLINT_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".xml"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [x] run on image

## Requires

- [ ] requires online access

## Known error-ids

__tbd__

## Checking scope

- [ ] security
- [x] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* xmllint.xmllint.*

### Error considered as style issue

* n.a.