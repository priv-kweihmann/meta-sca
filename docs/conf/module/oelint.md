# Configuration for oelint

## Supported environments/languages

* bitbake

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST_oelint | Blacklist filter for this tool | space-separated-list | ""
| SCA_OELINT_CUSTOM_RULES | Paths to custom rules for oelint | space-separated-list | "\${STAGING_DATADIR_NATIVE}/oelint-rules"
| SCA_OELINT_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_OELINT_EXTRA_KNOWN_MIRRORS | additional known mirror replacements. mirror:replacement without any ${} framing space-separated-list | ""
| SCA_OELINT_EXTRA_KNOWN_VARS | Additional known variable name | space-separated-list | ""
| SCA_OELINT_EXTRA_LAYERS | Extra layer configuration to load | space-separated-list | layers supported by oelint-adv and present
| SCA_OELINT_EXTRA_MANDATORY_VARS | Additional mandatory variables that should be set in a recipe | space-separated-list | ""
| SCA_OELINT_EXTRA_PROTECTED_APPEND_VARS | Additional variables that shouldn't be set in a bbappend | space-separated-list | ""
| SCA_OELINT_EXTRA_PROTECTED_VARS | Additional variables that shouldn't be set inside of a recipe | space-separated-list | ""
| SCA_OELINT_EXTRA_SUGGESTED_VARS | Additional suggested variable that should be set in a recipe | space-separated-list | ""
| SCA_OELINT_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_OELINT_IGNORE_SPARED_LAYER | Ignore findings from spared layer | 1 = yes, 0 = no | "1"
| SCA_OELINT_MODE | Check mode | fast or all | "fast"
| SCA_OELINT_RELEASE | Release of YP to check against | core layer compat name | "${LAYERSERIES_COMPAT_core}"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [ ] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__TBD__

## Checking scope

* [ ] security
* [ ] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* oelint.oelint.*
