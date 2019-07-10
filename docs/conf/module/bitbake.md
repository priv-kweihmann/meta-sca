# Configuration for bitbake

## Supported environments/languages

* bitbake

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_bitbake | Blacklist filter for this tool | space-separated-list | ""

## Supports

- [ ] suppression of ids
- [ ] terminate build on fatal
- [x] run on recipe
- [x] run on image

## Requires

- [ ] requires online access

## Known error-ids

* bitbake.bitbake.error - bitbake error printout
* bitbake.bitbake.warning - bitbake warning printout
* bitbake.bitbake.info - bitbake info printout

## Checking scope

- [ ] security
- [x] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* bitbake.bitbake.*

### Error considered as style issue

* n.a.