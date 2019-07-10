# Configuration for detectsecrets

## Supported environments/languages

* binaries

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_detectsecrets | Blacklist filter for this tool | space-separated-list | ""
| SCA_DETECTSECRETS_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_DETECTSECRETS_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

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

- [x] security
- [ ] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* detectsecrets.detectsecrets.*

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.