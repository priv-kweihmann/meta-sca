# Configuration for bandit

## Supported environments/languages

* python

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BANDIT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_BANDIT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_BLACKLIST_bandit | Blacklist filter for this tool | space-separated-list | "linux-*"

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

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* bandit.bandit.*

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.