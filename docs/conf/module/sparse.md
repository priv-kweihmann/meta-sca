# Configuration for sparse

## Supported environments/languages

* C

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_sparse | Blacklist filter for this tool | space-separated-list | ""
| SCA_SPARSE_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | "":
| SCA_SPARSE_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_SPARSE_FILE_FILTER | File extensions to check on | space-separated-list | ".c"
| SCA_SPARSE_WARNINGS | Warnings to check on | space-separated-list | "-Wsparse-all"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [ ] requires online access

## Known error-ids

__TDB__

## Checking scope

- [ ] security
- [x] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* sparse.sparse.*

### Error considered as style issue

* n.a.
