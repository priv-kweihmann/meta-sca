# Configuration for ansiblelint

## Supported environments/languages

* ansible

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_ansiblelint | Blacklist filter for this tool | space-separated-list | ""
| SCA_ANSIBLELINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_ANSIBLELINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_ANSIBLELINT_FILE_FILTER | List of file extensions to search for playbooks | space-separated-list | ".yaml"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [x] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [ ] requires online access

## Known error-ids

__tbd__

## Checking scope

- [x] security
- [x] functional defects
- [x] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Quality

## Score mapping

### Error considered as security relevant

* ansiblelint.ansiblelint.103
* ansiblelint.ansiblelint.104
* ansiblelint.ansiblelint.202
* ansiblelint.ansiblelint.302
* ansiblelint.ansiblelint.304
* ansiblelint.ansiblelint.306
* ansiblelint.ansiblelint.403

### Error considered as functional defect

* ansiblelint.ansiblelint.101
* ansiblelint.ansiblelint.102
* ansiblelint.ansiblelint.105
* ansiblelint.ansiblelint.301
* ansiblelint.ansiblelint.303
* ansiblelint.ansiblelint.305
* ansiblelint.ansiblelint.401
* ansiblelint.ansiblelint.402
* ansiblelint.ansiblelint.501
* ansiblelint.ansiblelint.602

### Error considered as style issue

* ansiblelint.ansiblelint..*