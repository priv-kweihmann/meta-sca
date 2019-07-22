# Configuration for rats

## Supported environments/languages

* C
* PHP
* ruby
* python
* perl

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_rats | Blacklist filter for this tool | space-separated-list | ""
| SCA_RATS_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_RATS_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [ ] requires online access

## Known error-ids

__tbd__

## Checking scope

- [x] security
- [ ] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Quality

## Score mapping

### Error considered as security relevant

* rats.rats.*

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.