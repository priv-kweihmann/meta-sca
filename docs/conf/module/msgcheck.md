# Configuration for msgcheck

## Supported environments/languages

* i18n

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[msgcheck] | Blacklist filter for this tool | space-separated-list | ""
| SCA_MSGCHECK_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_MSGCHECK_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* msgcheck.msgcheck.compile
* msgcheck.msgcheck.lines
* msgcheck.msgcheck.punct
* msgcheck.msgcheck.whitespace
* msgcheck.msgcheck.whitespace_eol

## Checking scope

* [ ] security
* [ ] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* msgcheck.msgcheck.*
