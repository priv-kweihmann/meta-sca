# Configuration for pysymcheck

## Supported environments/languages

* binaries

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[pysymcheck] | Blacklist filter for this tool | space-separated-list | ""
| SCA_PYSYMCHECK_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_PYSYMCHECK_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_PYSYMCHECK_RULE_FILE | Configuration-file to be used. Must be installed to \<root\>/usr/bin/pysymbolcheck/ | string: basic_rules.json | "basic_rules.json"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [ ] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [x] security
* [ ] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Quality

## Score mapping

### Error considered as security relevant

* pysymbolcheck.pysymbolcheck.*

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
