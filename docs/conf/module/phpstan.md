# Configuration for phpstan

## Supported environments/languages

* PHP

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_phpstan | Blacklist filter for this tool | space-separated-list | ""
| SCA_PHPSTAN_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_PHPSTAN_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_PHPSTAN_FILE_FILTER | File extensions to check | space-separated-list | ".php"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [x] requires online access

## Known error-ids

__tbd__

## Checking scope

- [ ] security
- [x] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a. 

### Error considered as functional defect

* phpstan.phpstan.*

### Error considered as style issue

* n.a.
