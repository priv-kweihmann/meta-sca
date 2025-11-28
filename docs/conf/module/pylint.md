# Configuration for pylint

## Supported environments/languages

* python

## Configuration for image

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[pylint] | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_PYLINT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_PYLINT_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_PYLINT_HOMEPATH | Directory of python installation | path | \${IMAGE_ROOTFS}/python\${PYTHON_BASEVERSION}
| SCA_PYLINT_LIBATH | List of library paths for python | ':' separated list | \${IMAGE_ROOTFS}/python\${PYTHON_BASEVERSION}/:\${IMAGE_ROOTFS}/python.\${PYTHON_BASEVERSION}/site-packages/
| SCA_PYLINT_ROOTPATH | Root path from where checks should be performed | path | \${IMAGE_ROOTFS}

# Configuration for recipe

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[pylint] | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_PYLINT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_PYLINT_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_PYLINT_HOMEPATH | Directory of python installation | path | \${STAGING_LIBDIR}/python\${PYTHON_BASEVERSION}
| SCA_PYLINT_LIBATH | List of library paths for python | ':' separated list | \${STAGING_LIBDIR}/python\${PYTHON_BASEVERSION}/:\${STAGING_LIBDIR}/python\${PYTHON_BASEVERSION}/site-packages/
| SCA_PYLINT_ROOTPATH | Root path from where checks should be performed | path | \${B}

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* pylint.pylint.E*
* pylint.pylint.F*
* pylint.pylint.W*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* pylint.pylint.*
