SCA_ENABLE ?= "1"
SCA_EXPORT_DIR ?= "${DEPLOY_DIR_IMAGE}/sca"
SCA_EXPORT_FINDING_SRC = "1"
SCA_EXPORT_FINDING_DIR ?= "${DEPLOY_DIR_IMAGE}/sca/sources/${PN}/"

SCA_EXPORT_FORMAT ?= "checkstyle"
SCA_EXPORT_FORMAT_SUFFIX_checkstyle = "xml"

SCA_AUTO_INH_ON_IMAGE ?= "1"
SCA_AUTO_INH_ON_RECIPE ?= "1"

## Just apply the one of the following license (regex)
SCA_AUTO_LICENSE_FILTER ?= ".*"

## All findings below this level will be dropped
## from checkstyle-result
## possible options error, warning or info
SCA_WARNING_LEVEL ?= "warning"

## Enable an extra report per image
SCA_ENABLE_IMAGE_SUMMARY ?= "1"

## Enable an extra report from bestof-module
SCA_ENABLE_BESTOF ?= "0"

## Enable an score calculation
SCA_ENABLE_SCORE ?= "1"

## Standard python interpreter to be used in SCA
SCA_STD_PYTHON_INTERPRETER ?= "python3"

## Cleanup old files before exporting
SCA_CLEAN_BEFORE_EXPORT ?= "1"

## List of overall available modules
SCA_AVAILABLE_MODULES ?= "\
                          ansible \
                          ansiblelint \
                          bandit \
                          bashate \
                          bitbake \
                          checkbashism \
                          cppcheck \
                          cpplint \
                          cqmetrics \
                          cspell \
                          cvecheck \
                          dennis \
                          detectsecrets \
                          eslint \
                          flint \
                          gcc \
                          gixy \
                          htmlhint \
                          jsonlint \
                          kconfighard \
                          oelint \
                          proselint \
                          pyfindinjection \
                          pylint \
                          pysymcheck \
                          pytype \
                          radon \
                          rats \
                          ropgadget \
                          score \
                          shellcheck \
                          standard \
                          stylelint \
                          systemdlint \
                          textlint \
                          tscancode \
                          xmllint \
                          yamllint \
                          zrd"

SCA_ENABLED_MODULES = "${SCA_ENABLED_MODULES_${SCA_MODE_UPPER}}"