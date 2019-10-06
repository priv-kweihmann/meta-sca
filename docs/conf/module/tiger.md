# Configuration for tiger

## Supported environments/languages

* image

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_tiger | Blacklist filter for this tool | space-separated-list | ""
| SCA_TIGER_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_TIGER_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [ ] run on recipe
- [x] run on image
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

 - ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* tiger.tiger.*

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.
