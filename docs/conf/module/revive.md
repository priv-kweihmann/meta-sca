# Configuration for revive

## Supported environments/languages

* GO

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLOCKLIST[revive] | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_REVIVE_EXTRA_FATAL | Extra error-IDs leading to build termination when found | space-separated-list | ""
| SCA_REVIVE_EXTRA_SUPPRESS | Extra error-IDs to be suppressed | space-separated-list | ""
| SCA_REVIVE_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".go"

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [ ] requires online access

## Known error-IDs

* revive.revive.add-constant
* revive.revive.argument-limit
* revive.revive.atomic
* revive.revive.bare-return
* revive.revive.blank-imports
* revive.revive.bool-literal-in-expr
* revive.revive.call-to-gc
* revive.revive.confusing-naming
* revive.revive.confusing-results
* revive.revive.constant-logical-expr
* revive.revive.context-as-argument
* revive.revive.context-keys-type
* revive.revive.cyclomatic
* revive.revive.deep-exit
* revive.revive.dot-imports
* revive.revive.duplicated-imports
* revive.revive.empty-block
* revive.revive.empty-lines
* revive.revive.error-naming
* revive.revive.error-return
* revive.revive.error-strings
* revive.revive.errorf
* revive.revive.exported
* revive.revive.file-header
* revive.revive.flag-parameter
* revive.revive.function-result-limit
* revive.revive.get-return
* revive.revive.if-return
* revive.revive.increment-decrement
* revive.revive.indent-error-flow
* revive.revive.imports-blacklist
* revive.revive.import-shadowing
* revive.revive.line-length-limit
* revive.revive.max-public-structs
* revive.revive.modifies-parameter
* revive.revive.modifies-value-receiver
* revive.revive.package-comments
* revive.revive.range
* revive.revive.range-val-in-closure
* revive.revive.receiver-naming
* revive.revive.redefines-builtin-id
* revive.revive.struct-tag
* revive.revive.superfluous-else
* revive.revive.time-naming
* revive.revive.var-naming
* revive.revive.var-declaration
* revive.revive.unexported-return
* revive.revive.unhandled-error
* revive.revive.unnecessary-stmt
* revive.revive.unreachable-code
* revive.revive.unused-parameter
* revive.revive.unused-receiver
* revive.revive.waitgroup-by-value

## Checking scope

* [ ] security
* [x] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* revive.revive.add-constant
* revive.revive.argument-limit
* revive.revive.atomic
* revive.revive.bare-return
* revive.revive.blank-imports
* revive.revive.bool-literal-in-expr
* revive.revive.call-to-gc
* revive.revive.confusing-results
* revive.revive.constant-logical-expr
* revive.revive.context-as-argument
* revive.revive.context-keys-type
* revive.revive.deep-exit
* revive.revive.dot-imports
* revive.revive.empty-block
* revive.revive.error-return
* revive.revive.error-strings
* revive.revive.errorf
* revive.revive.file-header
* revive.revive.flag-parameter
* revive.revive.function-result-limit
* revive.revive.get-return
* revive.revive.if-return
* revive.revive.import-shadowing
* revive.revive.imports-blacklist
* revive.revive.increment-decrement
* revive.revive.indent-error-flow
* revive.revive.line-length-limit
* revive.revive.max-public-structs
* revive.revive.modifies-parameter
* revive.revive.modifies-value-receiver
* revive.revive.range
* revive.revive.range-val-in-closure
* revive.revive.receiver-naming
* revive.revive.redefines-builtin-id
* revive.revive.struct-tag
* revive.revive.superfluous-else
* revive.revive.unexported-return
* revive.revive.unhandled-error
* revive.revive.unnecessary-stmt
* revive.revive.unreachable-code
* revive.revive.unused-parameter
* revive.revive.unused-receiver
* revive.revive.var-declaration
* revive.revive.waitgroup-by-value

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* revive.revive.confusing-naming
* revive.revive.cyclomatic
* revive.revive.duplicated-imports
* revive.revive.empty-lines
* revive.revive.error-naming
* revive.revive.exported
* revive.revive.package-comments
* revive.revive.time-naming
* revive.revive.var-naming
