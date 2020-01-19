# Configuration for reconbf

## Supported environments/languages

* image

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_reconbf | Blacklist filter for this tool | space-separated-list | ""
| SCA_RECONFBF_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_RECONFBF_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_RECONBF_CONFIG | Path of config to use | path | "\${datadir}/etc/reconbf/hos.cfg"


## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [ ] run on recipe
* [x] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [x] security
* [ ] functional defects
* [ ] style issues

## Statistics

* ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* reconbf.reconbf.*

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.
