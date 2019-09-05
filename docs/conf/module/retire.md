# Configuration for retire

## Supported environments/languages

* Javascript, NPM

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_retire | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_RETIRE_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_RETIRE_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_RETIRE_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".js .json"

## Supports

- [ ] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [x] requires online access

## Known error-ids

* retire.retire.knownVulnerability

## Checking scope

- [x] security
- [ ] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* retire.retire.knownVulnerability

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.
