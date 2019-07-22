# Configuration for cvecheck

## Supported environments/languages

* CVEs

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_cvecheck | Blacklist filter for this tool | space-separated-list | ""

## Supports

- [ ] suppression of ids
- [ ] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [x] requires online access

## Known error-ids

* cvecheck.cvecheck.unpatched - An unpatched CVE was detected

## Checking scope

- [x] security
- [ ] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* cvecheck.cvecheck.unpatched

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.