# Configuration for tlv

## Supported environments/languages

* code duplications
* metrics

## Configuration for recipe

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[tlv] | Blacklist filter for this tool | space-separated-list | "linux-.*"
| SCA_TLV_MINLINES | Minimum number of lines before issue is reported | int | "8"
| SCA_TLV_MINTOKEN | Minimum number of token in block before issue is reported | int | "25"
| SCA_TLV_FILES | List of glob-expression for files to check | space-separated-list | "\${SCA_SOURCES_DIR}/\* \${SCA_SOURCES_DIR}/\*\*/\*"

## Configuration for image

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[tlv] | Blacklist filter for this tool | space-separated-list | "linux-.*"
| SCA_TLV_MINLINES | Minimum number of lines before issue is reported | int | "8"
| SCA_TLV_MINTOKEN | Minimum number of token in block before issue is reported | int | "25"
| SCA_TLV_FILES | List of glob-expression for files to check | space-separated-list | "\${SCA_SOURCES_DIR}/\${sysconfdir}/\* \${SCA_SOURCES_DIR}/\${sysconfdir}/\*\*/\*"

## Supports

* [ ] suppression of IDs
* [ ] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [x] available in SDK
* [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [x] requires online access

## Known error-IDs

* tlv.tlv.Duplicate - The code is exactly the same
* tlv.tlv.TooLessVariation - The code is nearly the same

## Checking scope

* [x] security
* [ ] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
* ⬛⬜⬜⬜⬜⬜⬜⬜⬜⬜ 01/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* tlv.tlv.*
