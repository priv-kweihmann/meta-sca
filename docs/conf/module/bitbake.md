# Configuration for bitbake

## Supported environments/languages

* bitbake

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[bitbake] | Blacklist filter for this tool | space-separated-list | ""
| SCA_BITBAKE_HARDENING | Check on additional hardening | space-separated-list | "debug_tweaks insane_skip security_flags"

### Hardening checks

* debug_tweaks - debug_tweaks isn't set in IMAGE_FEATURES if building release build. [For details see here](https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html#considerations-specific-to-the-openembedded-build-system)
* insane_skip - INSANE_SKIP isn't used in the recipe. So it's ensured that recipe is properly build in a YOCTO way
* security_flags - Poky security_flags are used. [For details see here](https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html#security-flags)

## Supports

* [ ] suppression of IDs
* [ ] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [ ] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* bitbake.bitbake.error - bitbake error printout
* bitbake.bitbake.warning - bitbake warning printout
* bitbake.bitbake.info - bitbake info printout

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* bitbake.bitbake.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
