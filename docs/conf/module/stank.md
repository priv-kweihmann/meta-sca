# Configuration for stank

## Supported environments/languages

* shell

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[stank] | Blacklist filter for this tool | space-separated-list | ""
| SCA_STANK_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_STANK_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_STANK_FILE_FILTER | File extension to scan for | space-separated-list | ".sh .osh .lksh .csh .cshrc .tcsh .tcshrc .fish .fishrc .ion .ionrc .rc .rcrc .tsh .etsh .elv"
| SCA_STANK_SHEBANG | Shebang filter to scan for | regular expression | ".*ash|bash|csh|dash|elvish|fish|ion|ksh|ksh93|lksh|mksh|pdksh|posh|rc|sh|tcsh|zsh"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [x] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* stank.stank.ConfigExecBits
* stank.stank.ConfigShebang
* stank.stank.EOLMissing
* stank.stank.LineEnding
* stank.stank.MissingShebang
* stank.stank.ModulinoAmbiguity
* stank.stank.Performance
* stank.stank.Portability
* stank.stank.Robustness
* stank.stank.ShebangMismatch

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜ 04/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* stank.stank.MissingShebang

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* stank.stank.ConfigExecBits
* stank.stank.ConfigShebang
* stank.stank.EOLMissing
* stank.stank.LineEnding
* stank.stank.ModulinoAmbiguity
* stank.stank.Performance
* stank.stank.Portability
* stank.stank.Robustness
* stank.stank.ShebangMismatch
