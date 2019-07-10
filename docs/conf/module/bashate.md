# Configuration for bashate

## Supported environments/languages

* shell

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BASHATE_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_BASHATE_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_BLACKLIST_bashate | Blacklist filter for this tool | space-separated-list | ""

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
- [x] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error considered as style issue

* bashate.bashate.*