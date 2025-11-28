# Configuration for cbmc

## Supported environments/languages

* C

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[cbmc] | Blacklist filter for this tool | space-separated-list | ""
| SCA_CBMC_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_CBMC_EXTRA_OPTIONS | Extra command-line parameter to pass to cbmc | space-separated-list | ""
| SCA_CBMC_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_CBMC_FILE_FILTER | File extensions to parse | space-separated-list | ".c"
| SCA_CBMC_MODULES | Check modules to run | space-separated-list | see cbmc.bbclass for details

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [ ] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [x] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* cbmc.cbmc.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
