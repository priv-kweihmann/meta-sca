## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-log

SCA_ENABLE ?= "1"
SCA_EXPORT_DIR ?= "${DEPLOY_DIR_IMAGE}/sca"
SCA_EXPORT_FINDING_SRC ?= "1"
SCA_EXPORT_FINDING_DIR ?= "${DEPLOY_DIR_IMAGE}/sca/sources/${PN}/"

# local workspace dir to export findings
SCA_FINDINGS_DIR ?= "${WORKDIR}/sca"

# Add layer names, like 'core' or 'openembedded-layer' to suppress
# SCA on all recipes of that layer
SCA_SPARE_LAYER ?= ""
# Additional regular expressions for paths that shouldn't
# run SCA
SCA_SPARE_DIRS ?= ""
# if set to 1 all bbappends from non-suppressed layer will
# not invoke SCA, which means in consequence that if the value
# is != 1 an bbappend from a non-supressed layer will
# lead SCA to be invoked
SCA_SPARE_IGNORE_BBAPPEND ?= "0"

## Valid values are 'checkstyle' or 'console' or 'diff' or 'codeclimate' or 'sarif' or 'plain'
SCA_EXPORT_FORMAT ?= "checkstyle"
SCA_EXPORT_FORMAT_SUFFIX_checkstyle = "xml"
SCA_EXPORT_FORMAT_SUFFIX_console = "txt"
SCA_EXPORT_FORMAT_SUFFIX_diff = "txt"
SCA_EXPORT_FORMAT_SUFFIX_codeclimate = "json"
SCA_EXPORT_FORMAT_SUFFIX_sarif = "sarif"
SCA_EXPORT_FORMAT_SUFFIX_plain = "txt"

SCA_AUTO_INH_ON_IMAGE ?= "1"
SCA_AUTO_INH_ON_RECIPE ?= "1"

## Just apply the one of the following license (regex)
SCA_AUTO_LICENSE_FILTER ?= ".*"

## All findings below this level will be dropped
## from output result
## possible options error, warning or info
SCA_WARNING_LEVEL ?= "warning"

## Enable an extra report per image
SCA_ENABLE_IMAGE_SUMMARY ?= "1"

## Enable an extra report from bestof-module
SCA_ENABLE_BESTOF ?= "0"

## Shebang for python interpreter
SCA_PYTHON_SHEBANG = ".*python3"

## Cleanup old files before exporting
SCA_CLEAN_BEFORE_EXPORT ?= "1"

## Backtrack findings in images to their original recipes
SCA_BACKTRACK ?= "0"

## Force run of SCA
SCA_FORCE_RUN ??= "0"

## Verbose output of SCA invocation
SCA_VERBOSE_OUTPUT ??= "0"

## Skip SCA when running under devtool (default = autodetect)
SCA_SKIP_DEVTOOL ??= "${@oe.utils.ifelse(bb.data.inherits_class('externalsrc', d), '1', '0')}"

## Filter by scope
SCA_SCOPE_FILTER ?= "security functional compliance style"

## List of rules for transforming severity
## example: pylint.pylint.C0103=error
SCA_SEVERITY_TRANSFORM ?= ""

## List of overall available modules
SCA_AVAILABLE_MODULES ?= "\
                          alexkohler \
                          ansible \
                          ansiblelint \
                          ansibleroles \
                          bandit \
                          bashate \
                          bitbake \
                          cbmc \
                          checkbashism \
                          configcheck \
                          cppcheck \
                          cpplint \
                          cspell \
                          darglint \
                          dennis \
                          detectsecrets \
                          eslint \
                          flake8 \
                          flawfinder \
                          flint \
                          gcc \
                          gixy \
                          goconst \
                          golint \
                          gosec \
                          htmlhint \
                          jshint \
                          jsonlint \
                          kconfighard \
                          looong \
                          lse \
                          lynis \
                          msgcheck \
                          mypy \
                          nixauditor \
                          npmaudit \
                          oelint \
                          perl \
                          perlcritic \
                          pkgqaenc \
                          proselint \
                          pscan \
                          pyfindinjection \
                          pylint \
                          pyright \
                          pysymcheck \
                          pytype \
                          rats \
                          reconbf \
                          reek \
                          retire \
                          reuse \
                          revive \
                          rubycritic \
                          safety \
                          setuptoolslint \
                          shellcheck \
                          slick \
                          sparse \
                          standard \
                          stank \
                          stylelint \
                          sudokiller \
                          systemdlint \
                          textlint \
                          tiger \
                          tscancode \
                          upc \
                          vulture \
                          wotan \
                          xmllint \
                          yamllint \
                          yara \
                        "

SCA_ENABLED_MODULES := "${SCA_ENABLED_MODULES_${SCA_MODE_UPPER}}"

SCA_HASHEXCLUDE_VARS = "\
                        __SCA_DATAMODEL_STORAGE \
                        SCA_DATAMODEL_STORAGE \
                        SCA_LAYERDIR \
                        "
