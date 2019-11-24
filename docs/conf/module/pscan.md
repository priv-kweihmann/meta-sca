# Configuration for pscan

## Supported environments/languages

* C

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_pscan | Blacklist filter for this tool | space-separated-list | ""
| SCA_PSCAN_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_PSCAN_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_PSCAN_FILE_FILTER |  File extensions to check | space-separated-list | ".c"

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

pscan.pscan.NonConstantString
pscan.pscan.InsecurePrintf

## Checking scope

* [ ] security
* [x] functional defects
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* pscan.pscan.NonConstantString
* pscan.pscan.InsecurePrintf

### Error considered as style issue

* n.a.
