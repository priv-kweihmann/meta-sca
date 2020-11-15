# Configuration for semgrep

## Supported environments/languages

* c
* c++
* go
* html
* javascript
* json
* php
* python
* ruby
* yaml"

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_semgrep | Blacklist filter for this tool | space-separated-list | ""
| SCA_SEMGREP_ALLOW_ARBITRARY_CODE | Allow more in-depth testing with code execution | int 0 = no, 1 = yes| "1"
| SCA_SEMGREP_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | "":
| SCA_SEMGREP_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_SEMGREP_RULESETS | Rule directories to use | comma separated regex list | see `sca-semgrep.bbclass`
| SCA_SEMGREP_USER_RULES_RECIPES | Additional recipes providing user rules | comma separated regex list | ""

## Add your own rules

You can add your own rules to semgrep. For the format description please see the [rule documentation](https://semgrep.dev/docs/writing-rules/rule-syntax/).
Also check out [the interactive playyground](https://semgrep.dev/learn).

Resulting `yml`-files or complete folder have to be installed from `native` recipe into the sysroot.
Just add the recipe name to `SCA_SEMGREP_USER_RULES_RECIPES` and add the path in the sysroot where to find file/files/folder to `SCA_SEMGREP_RULESETS` (e.g. `SCA_SEMGREP_RULESETS_append = "${STAGING_DATADIR_NATIVE}/my-personal-semgrep/rules`)

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

__tbd__

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [ ] style issues

## Statistics

* ⬛⬛⬜⬜⬜⬜⬜⬜⬜⬜ 02/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* semgrep.semgrep.*

### Error considered as compliance issue

* n.a.

### Error considered as style issue

* n.a.
