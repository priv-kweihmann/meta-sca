# Configuration for phpmd

## Supported environments/languages

* PHP

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_phpmd | Blacklist filter for this tool | space-separated-list | ""
| SCA_PHPMD_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_PHPMD_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_PHPMD_FILE_FILTER | File extensions to check | space-separated-list | ".php .phtml"
| SCA_PHPMD_CHECKS | Checks to perform | space-separated-list | "codesize cleancode controversial naming unusedcode design"

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

* [ ] security
* [x] functional defects
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Quality

## Score mapping

### Error considered as security relevant

* n.a. 

### Error considered as functional defect

* phpmd.phpmd.*

### Error considered as style issue

* n.a.
