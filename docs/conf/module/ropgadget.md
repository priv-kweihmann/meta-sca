### Available configuration for ropgadget

This module is somehow different - it tries to get all code which is somehow exploitable by ROP (return oriented programming).
If the number of findings exceeds the configured threshold value a warning is issued.
The findings themselves are only created as "info" level findings. 
So if you actually want to see the details you can have a look into the raw-file or you have to 
configure SCA_WARNING_LEVEL to "info".

## Supported environments/languages

* binaries

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_ropgagdet | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_ROPGADGET_WARNING_THRESHOLD | Threshold value when to issue a warning | integer | "500"

## Supports

- [ ] suppression of ids
- [ ] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [ ] requires online access

## Known error-ids

__tbd__

## Notes

A large value does not actually mean that your binary __is__ exploitable, but a larger number actually raises the probability a lot that it __could__ be done

## Checking scope

- [x] security
- [ ] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜ 05/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* ropgadget.ropgadget.*

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.