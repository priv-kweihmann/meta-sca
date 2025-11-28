# Configuration for darglint

## Supported environments/languages

* python

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[darglint] | Blacklist filter for this tool | space-separated-list | ""
| SCA_DARGLINT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_DARGLINT_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

darglint.darglint.DAR001: The docstring was not parsed correctly due to a syntax error.
darglint.darglint.DAR002: An argument/exception lacks a description
darglint.darglint.DAR003: A line is under-indented or over-indented.
darglint.darglint.DAR004: The docstring contains an extra newline where it shouldn't.
darglint.darglint.DAR101: The docstring is missing a parameter in the definition.
darglint.darglint.DAR102: The docstring contains a parameter not in function.
darglint.darglint.DAR103: The docstring parameter type doesn't match function.
darglint.darglint.DAR201: The docstring is missing a return from definition.
darglint.darglint.DAR202: The docstring has a return not in definition.
darglint.darglint.DAR203: The docstring parameter type doesn't match function.
darglint.darglint.DAR301: The docstring is missing a yield present in definition.
darglint.darglint.DAR302: The docstring has a yield not in definition.
darglint.darglint.DAR401: The docstring is missing an exception raised.
darglint.darglint.DAR402: The docstring describes an exception not explicitly raised.
darglint.darglint.DAR501: The docstring describes a variable which is not defined.

## Checking scope

* [ ] security
* [ ] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* darglint.darglint.*
