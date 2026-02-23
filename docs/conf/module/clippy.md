# Configuration for clippy

## Supported environments/languages

* Rust

## Configuration

| var                       |                         purpose                         |                 type |                    default |
| ------------------------- | :-----------------------------------------------------: | -------------------: | -------------------------: |
| SCA_BLOCKLIST[clippy]     |             Blacklist filter for this tool              | space-separated-list |                         "" |
| SCA_CLIPPY_EXTRA_FATAL    | Extra error-IDs leading to build termination when found | space-separated-list |                         "" |
| SCA_CLIPPY_EXTRA_OPTIONS  |     Extra command-line parameter to pass to clippy      | space-separated-list |                         "" |
| SCA_CLIPPY_EXTRA_SUPPRESS |            Extra error-IDs to be suppressed             | space-separated-list |                         "" |
| SCA_CLIPPY_FILE_FILTER    |                File extensions to parse                 | space-separated-list | "Cargo.toml **/Cargo.toml" |

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

__tbd__

## Checking scope

* [x] security
* [x] functional defects
* [ ] compliance
* [x] style issues

## Statistics

* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Build Speed
* ⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜ 07/10 Execution Speed
* ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬜ 09/10 Quality

## Score mapping

### Error considered as security relevant

* n.a.

### Error considered as functional defect

* clippy.clippy.*

### Error consired as compliance issue

* n.a.

### Error considered as style issue

* n.a.
