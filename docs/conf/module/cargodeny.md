# Configuration for cargodeny

## Supported environments/languages

* Rust

## Configuration

| var                           |                         purpose                         |                 type |                                                                                         default |
| ----------------------------- | :-----------------------------------------------------: | -------------------: | ----------------------------------------------------------------------------------------------: |
| SCA_BLOCKLIST[cargodeny]      |             Blacklist filter for this tool              | space-separated-list |                                                                                              "" |
| SCA_CLIPPY_EXTRA_FATAL        | Extra error-IDs leading to build termination when found | space-separated-list |                                                                                              "" |
| SCA_CLIPPY_EXTRA_OPTIONS      |    Extra command-line parameter to pass to cargodeny    | space-separated-list |                                                                                              "" |
| SCA_CLIPPY_EXTRA_SUPPRESS     |            Extra error-IDs to be suppressed             | space-separated-list |                                                                                              "" |
| SCA_CLIPPY_FILE_FILTER        |                File extensions to parse                 | space-separated-list |                                                                      "Cargo.toml **/Cargo.toml" |
| SCA_CARGODENY_CHECKS          |                    Checks to perform                    | space-separated-list |                                                                   "advisories ban bans sources" |
| SCA_CARGODENY_SKIP_IDS        |             Findings to skip automatically              | space-separated-list | "index-failure advisory-ignored yanked-ignored index-cache-load-failure allowed checksum-match" |
| SCA_CARGODENY_ADVISORIES_PATH |                   Path to advisory-db                   |                  str |                                                                     "${STAGING_DATADIR_NATIVE}" |

## Supports

* [x] suppression of IDs
* [x] terminate build on fatal
* [x] run on recipe
* [ ] run on image
* [x] available in SDK
* [x] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

* [x] requires online access

## Known error-IDs

See [online documentation](https://embarkstudios.github.io/cargo-deny/checks/index.html).
All IDs are prefixed with ``cargodeny.cargodeny.``

## Checking scope

* [x] security
* [ ] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* cargodeny.cargodeny.advisory-not-detected
* cargodeny.cargodeny.allowed-by-wrapper
* cargodeny.cargodeny.banned
* cargodeny.cargodeny.build-script-not-allowed
* cargodeny.cargodeny.checksum-mismatch
* cargodeny.cargodeny.default-feature-enabled
* cargodeny.cargodeny.denied-by-extension
* cargodeny.cargodeny.detected-executable
* cargodeny.cargodeny.detected-executable-script
* cargodeny.cargodeny.exact-features-mismatch
* cargodeny.cargodeny.feature-banned
* cargodeny.cargodeny.feature-not-explicitly-allowed
* cargodeny.cargodeny.features-enabled
* cargodeny.cargodeny.non-root-path
* cargodeny.cargodeny.non-utf8-path
* cargodeny.cargodeny.not-allowed
* cargodeny.cargodeny.notice
* cargodeny.cargodeny.path-bypassed
* cargodeny.cargodeny.path-bypassed-by-glob
* cargodeny.cargodeny.skipped
* cargodeny.cargodeny.skipped-by-root
* cargodeny.cargodeny.unable-to-check-path
* cargodeny.cargodeny.unknown-advisory
* cargodeny.cargodeny.unknown-feature
* cargodeny.cargodeny.unmaintained
* cargodeny.cargodeny.unmatched-bypass
* cargodeny.cargodeny.unmatched-glob
* cargodeny.cargodeny.unmatched-path-bypass
* cargodeny.cargodeny.unmatched-root
* cargodeny.cargodeny.unmatched-skip
* cargodeny.cargodeny.unmatched-skip-root
* cargodeny.cargodeny.unmatched-wrapper
* cargodeny.cargodeny.unnecessary-skip
* cargodeny.cargodeny.unresolved-workspace-dependency
* cargodeny.cargodeny.unsound
* cargodeny.cargodeny.unused-workspace-dependency
* cargodeny.cargodeny.unused-wrapper
* cargodeny.cargodeny.vulnerability
* cargodeny.cargodeny.wildcard
* cargodeny.cargodeny.workspace-duplicate
* cargodeny.cargodeny.yanked
* cargodeny.cargodeny.yanked-not-detected

### Error considered as functional defect

* n.a.

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* cargodeny.cargodeny.duplicate
* cargodeny.cargodeny.*
