# Configuration for reuse

## Supported environments/languages

* licensing

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_reuse | Blacklist filter for this tool | space-separated-list | ""
| SCA_REUSE_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_REUSE_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* reuse.reuse.license - A non matching LICENSE setting was detected
* reuse.reuse.nocopyright - No copyright info was found in a file
* reuse.reuse.noinfo - A file without copyright information was found

## Checking scope

* [ ] security
* [ ] functional defects
* [x] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error considered as compliance issue

* reuse.reuse.*

### Error considered as style issue

* n.a.
