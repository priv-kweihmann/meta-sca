# Global configuration

The behavior of the analysis can be controlled by several __bitbake__-variables

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:|
| SCA_AUTO_INH_ON_IMAGE | Do automatically enable analysis on image-recipes | string | "1"
| SCA_AUTO_INH_ON_RECIPE | Do automatically enable analysis on other recipes | string | "1"
| SCA_AUTO_LICENSE_FILTER | Filter according to recipe license if sca should invoked | space separated regular expression | ".*"
| SCA_AVAILABLE_MODULES | List of all available modules, use to globally enable/disable modules | space-separated-string | all available modules
| SCA_CLEAN_BEFORE_EXPORT | Remove old files from export dir | string: 0 or 1 | "1"
| SCA_ENABLE | Does globally enable the analysis | string | "1"
| SCA_ENABLE_BESTOF | Enables/disables the BestOf mode (see chapter BestOf Mode) | string | "0"
| SCA_ENABLE_IMAGE_SUMMARY | En/disable the image-summary module | string | "1"
| SCA_ENABLED_MODULES_IMAGE | The analysis modules to be activated on images | space-separated-string | see sca-on-image.bbclass
| SCA_ENABLED_MODULES_RECIPE | The analysis modules to be activated on recipes | space-separated-string | see sca-on-recipe.bbclass
| SCA_EXPORT_DIR | Directory where to store the results of analysis | path | \${DEPLOY_DIR_IMAGE}/sca
| SCA_EXPORT_FINDING_DIR | The folder where to store the original source-files of findings | path | \${DEPLOY_DIR_IMAGE}/sca/sources/\${PN}/
| SCA_EXPORT_FINDING_SRC | Do copy the source-files of any finding to deploy-dir. This proved to helpful when integrating into Jenkins. | string | "1"
| SCA_EXPORT_FORMAT | Specifies the output format | string: checkstyle, console, diff, codeclimate or sarif or plain| "checkstyle"
| SCA_FILE_FILTER | List of glob-expression of file to skip for testing | space separated list | "tests/* test/* doc/* testsuite/* \*\*/tests/* \*\*/test/* \*\*/doc/* \*\*/testsuite/*"
| SCA_FINDINGS_DIR | Local folder where to store sca findings | path | \${WORKDIR}/sca/
| SCA_FORCE_RUN | Force running SCA every time, no matter if recipe code was changed  | string: "0" or "1" | "0"
| SCA_LOCAL_FILE_FILTER | List of glob-expression of additional files to skip for testing. This is applied when S dir is the same as WORKDIR | space separated list | "$RECIPE_SYSROOT $RECIPE_SYSROOT_NATIVE $T"
| SCA_SCOPE_FILTER | Filter for scope of findings | space separted list of 'security', 'functional', 'compliance' and 'style' | "security functional compliance style"
| SCA_SKIP_DEVTOOL | Skip SCA tasks when running under devtool | string: 0 or 1 | autodetect
| SCA_SOURCES_DIR | Path where to find the source-files to be checked | path | "\${B}" for recipes, "\${IMAGE_ROOTFS}" for images
| SCA_SPARE_DIRS | Additional regular expressions for paths that shouldn't run SCA | space seperated list | ""
| SCA_SPARE_IGNORE_BBAPPEND | Ignore bbappend files for making the decision if the recipe should be spared or not | string: 1 = yes, other no | "0"
| SCA_SPARE_LAYER | layer names, like 'core' or 'openembedded-layer' to suppress SCA on all recipes of that layer | space seperated list | ""
| SCA_TRACEFILES_LOOSE_INC | Files extensions to add in loose mode of tracefiles | space seperated list | .h .hpp
| SCA_TRACEFILES_MODE | Mode to trace source files from compiled binaries | string: full, loose or strict | "full"
| SCA_TRACEFILES_PKGS | Packages to inspect for tracing files | space seperated list | "\${PN}-lib \${PN}-bin \${PN}"
| SCA_VERBOSE_OUTPUT | Verbose output of included tools | string: 0 or 1 | "1"
| SCA_WARNING_LEVEL | Filter for severity of findings | string: info, warning or error | "warning"

## Notes

None

## Recommended settings

In the following you'll find recommended setting for different use cases.
Only settings that differ default are shown.

For more examples [see](examples)

### Check while developing

| var | setting |
| ------------- | -----:|
| SCA_ENABLE_IMAGE_SUMMARY | "0"
| SCA_WARNING_LEVEL | "error"

### Check nightly in CI

| var | setting |
| ------------- | -----:|
| SCA_WARNING_LEVEL | "info"
