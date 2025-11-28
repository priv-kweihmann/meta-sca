# Configuration for cvecheck

## Supported environments/languages

* CVEs

## Notes

Be aware that due to the openembedded-core-implementation of the CVE-database fetch this module will result in rebuilding
every recipe, which this module is activated for on every run.
So if you tend to include this module, please do it in an appropriate environment (like CI), or leave it disabled for now

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[cvecheck] | Blacklist filter for this tool | space-separated-list | ""

## Supports

* [ ] suppression of IDs
* [ ] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [ ] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [x] requires online access

## Known error-IDs

* cvecheck.cvecheck.unpatched - An unpatched CVE was detected

## Checking scope

* [x] security
* [ ] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* cvecheck.cvecheck.unpatched

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
