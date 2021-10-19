# Configuration for stylelint

## Supported environments/languages

* CSS
* SCSS

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_stylelint | Blacklist filter for this tool | space-separated-list | ""
| SCA_STYLELINT_CONFIG | Config to use | 'stylelint-config-standard' or 'stylelint-config-recommended' | "stylelint-config-standard"
| SCA_STYLELINT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_STYLELINT_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_STYLELINT_FILE_FILTER | Files to scan | space-separated-list | ".css .scss .html .htm"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [ ] security
* [ ] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* stylelint.stylelint.*
