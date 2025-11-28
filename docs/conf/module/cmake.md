# Configuration for cmake

## Supported environments/languages

* Cmake

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[cmake] | Blacklist filter for this tool | space-separated-list | ""
| SCA_CMAKE_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_CMAKE_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_CMAKE_LOGFILES | Logfiles to parse | space-separated-list | "do_configure do_compile do_install"
| SCA_CMAKE_DEPRECATION_WARNINGS | Enable cmake deprecation messages | int: "0" or "1" | "1"

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

* cmake.cmake.error
* cmake.cmake.warning

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* cmake.cmake.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
