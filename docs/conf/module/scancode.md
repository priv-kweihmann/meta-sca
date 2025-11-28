# Configuration for scancode

## Supported environments/languages

* licensing

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[scancode] | Blacklist filter for this tool | space-separated-list | ""
| SCA_SCANCODE_BAD_CRHOLDER |  Discouraged copyright holders | comma separated regex list | ""
| SCA_SCANCODE_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_SCANCODE_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_SCANCODE_LICENSE_FILE_EXCEPTIONS | Files that should be ignored for license info check | comma separated regex list | see `sca-scancode.bbclass` for details
| SCA_SCANCODE_LICENSE_FILE_MINLENGTH | Minimum length of license info | int | "2"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [ ] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* scancode.scancode.copyright - A discouraged copyright holder was identified
* scancode.scancode.license - A non matching LICENSE setting was detected
* scancode.scancode.missinglicfile - A file wasn't listed in LIC_FILES_CHKSUM
* scancode.scancode.noinfo - A file without copyright information was found

## Checking scope

* [ ] security
* [ ] functional defects
* [x] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Build Speed
* ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error considered as compliance issue

* scancode.scancode.*

### Error considered as style issue

* n.a.
