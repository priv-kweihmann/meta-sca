# Configuration for looong

## Supported environments/languages

* python

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_looong | Blacklist filter for this tool | space-separated-list | "linux-.*"
| SCA_LOOONG_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_LOOONG_ERR_THRESHOLD | If arg-list lenght exceeds this value issue an error instead of warning | int | "8"

## Supports

- [ ] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [ ] requires online access

## Known error-ids

looong.looong.TooLongArgumentList

## Checking scope

- [ ] security
- [ ] functional defects
- [x] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error considered as style issue

* looong.looong.*
