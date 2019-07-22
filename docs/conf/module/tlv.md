# Configuration for tlv

## Supported environments/languages

* code duplicattions
* metrics

## Configuration for recipe

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_tlv | Blacklist filter for this tool | space-separated-list | "linux-.*"
| SCA_TLV_MINLINES | Minimum number of lines before issue is reported | int | "8"
| SCA_TLV_MINTOKEN | Minimum number of token in block before issue is reported | int | "25"
| SCA_TLV_FILES | List of glob-expression for files to check | space-separated-list | "\$\{SCA\_SOURCES\_DIR\}/\* \$\{SCA\_SOURCES\_DIR\}/\*\*/\*"

## Configuration for image

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_tlv | Blacklist filter for this tool | space-separated-list | "linux-.*"
| SCA_TLV_MINLINES | Minimum number of lines before issue is reported | int | "8"
| SCA_TLV_MINTOKEN | Minimum number of token in block before issue is reported | int | "25"
| SCA_TLV_FILES | List of glob-expression for files to check | space-separated-list | "\$\{SCA\_SOURCES\_DIR\}/\$\{sysconfdir\}/\* \$\{SCA\_SOURCES\_DIR\}/\$\{sysconfdir\}/\*\*/\*"

## Supports

- [ ] suppression of ids
- [ ] terminate build on fatal
- [x] run on recipe
- [x] run on image
- [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [x] requires online access

## Known error-ids

* tlv.tlv.Duplicate - The code is exactly the same
* tlv.tlv.TooLessVariation - The code is nearly the same

## Checking scope

- [x] security
- [ ] functional defects
- [x] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Build Speed
 - ⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜ 03/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* n.a.

### Error considered as style issue

* tlv.tlv.*
