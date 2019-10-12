# Configuration for cbmc

## Supported environments/languages

* C

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_cbmc | Blacklist filter for this tool | space-separated-list | ""
| SCA_CBMC_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_CBMC_EXTRA_OPTIONS | Extra command-line parameter to pass to cbmc | space-separated-list | ""
| SCA_CBMC_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_CBMC_FILE_FILTER | File extensions to parse | space-separated-list | ".c"
| SCA_CBMC_MODULES | Check modules to run | space-separated-list | see cbmc.bbclass for details

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [x] requires online access

## Known error-ids

__tbd__

## Checking scope

- [ ] security
- [x] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* cbmc.cbmc.*

### Error considered as style issue

* n.a.