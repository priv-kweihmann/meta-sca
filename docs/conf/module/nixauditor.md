# Configuration for nixauditor

## Supported environments/languages

* image

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_nixauditor | Blacklist filter for this tool | space-separated-list | ""
| SCA_NIXAUDITOR_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_NIXAUDITOR_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""

## Note

As this tool was intentionally written to check RHEL-releases all rules regarding rpm, yum and centos-specific things have been turned off by default.

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [ ] run on recipe
* [x] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [x] security
* [ ] functional defects
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Build Speed
* ⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜ 03/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Quality

## Score mapping

### Error considered as security relevant

* nixauditor.nixauditor.*

### Error considered as functional defect

* n.a

### Error considered as style issue

* n.a
