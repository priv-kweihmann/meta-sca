# Configuration for pylint

## Supported environments/languages

* python

## Configuration for image

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_pylint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_PYLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_PYLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_PYLINT_HOMEPATH | Directory of python installation | path | \${IMAGE_ROOTFS}/python.3.5
| SCA_PYLINT_LIBATH | List of library paths for python | ':' separated list | \${IMAGE_ROOTFS}/python.3.5/:\${IMAGE_ROOTFS}/python.3.5/site-packages/
| SCA_PYLINT_ROOTPATH | Root path from where checks should be performed | path | \${IMAGE_ROOTFS}

# Configuration for recipe

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_pylint | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_PYLINT_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_PYLINT_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_PYLINT_HOMEPATH | Directory of python installation | path | \${STAGING_LIBDIR}/python.3.5
| SCA_PYLINT_LIBATH | List of library paths for python | ':' separated list | \${STAGING_LIBDIR}/python.3.5/:\${STAGING_LIBDIR}/python.3.5/site-packages/
| SCA_PYLINT_ROOTPATH | Root path from where checks should be performed | path | \${B}

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [x] run on image

## Requires

- [ ] requires online access

## Known error-ids

__tbd__

## Checking scope

- [ ] security
- [x] functional defects
- [x] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* pylint.pylint.E*
* pylint.pylint.F*
* pylint.pylint.W*

### Error considered as style issue

* pylint.pylint.*