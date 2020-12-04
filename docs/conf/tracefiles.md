# Trace sources from binaries

To avoid having false positives from sources files that are actually not begin part of the final
image you can use the __tracefiles__ module.

The module automatically extracts the really used files and matches them to the source tree.
This is especially useful for highly configurable binaries.

## Configuration

| var                      |                       purpose                       |                          type |        default |
| ------------------------ | :-------------------------------------------------: | ----------------------------: | -------------: |
| SCA_TRACEFILES_LOOSE_INC | Files extensions to add in loose mode of tracefiles |          space seperated list |      ".h .hpp" |
| SCA_TRACEFILES_MODE      |  Mode to trace source files from compiled binaries  | string: full, loose or strict |         "full" |
| SCA_TRACEFILES_PKGS      |        Packages to inspect for tracing files        |          space seperated list | "\${PACKAGES}" |

## Modes

- **full** considers any source file for reporting issues
- **loose** considers source files found in packaged data + all files set at `SCA_TRACEFILES_LOOSE_INC`
- **strict** only considers source files found in packaged data

## Notes

- __tracefiles__ module is only active for a defined subset of *recipe* based linting tools
