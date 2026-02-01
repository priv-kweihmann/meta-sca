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
# Allow list of layer names to apply sca to
SCA_ALLOW_LAYER ?= ""
# if set to 1 all bbappends from non-suppressed layer will
# not invoke SCA, which means in consequence that if the value
# is != 1 an bbappend from a non-supressed layer will
# lead SCA to be invoked
SCA_SPARE_IGNORE_BBAPPEND ?= "0"

## Valid values are
## 'checkstyle'
## 'codeclimate'
## 'console'
## 'diff'
## 'plain'
## 'sarif'
## 'stat'
SCA_EXPORT_FORMAT ?= "checkstyle"
SCA_EXPORT_FORMAT_SUFFIX_checkstyle = "xml"
SCA_EXPORT_FORMAT_SUFFIX_codeclimate = "json"
SCA_EXPORT_FORMAT_SUFFIX_console = "txt"
SCA_EXPORT_FORMAT_SUFFIX_diff = "txt"
SCA_EXPORT_FORMAT_SUFFIX_plain = "txt"
SCA_EXPORT_FORMAT_SUFFIX_sarif = "sarif"
SCA_EXPORT_FORMAT_SUFFIX_sonarqube = "json"
SCA_EXPORT_FORMAT_SUFFIX_stat = "json"

SCA_AUTO_INH_ON_IMAGE ?= "1"
SCA_AUTO_INH_ON_RECIPE ?= "1"

## Just apply the one of the following license (regex)
SCA_AUTO_LICENSE_FILTER ?= ".*"

## All findings below this level will be dropped
## from output result
## possible options error, warning or info
SCA_WARNING_LEVEL ?= "warning"

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

## Skip SCA when running under devtool (default = off)
SCA_SKIP_DEVTOOL ??= "0"

## Filter by scope
SCA_SCOPE_FILTER ?= "security functional compliance style"

## List of rules for transforming severity
## example: pylint.pylint.C0103=error
SCA_SEVERITY_TRANSFORM ?= ""

## List of overall available modules
SCA_AVAILABLE_MODULES ?= "\
                          bandit \
                          bashate \
                          bitbake \
                          cbmc \
                          checkbashism \
                          cmake \
                          cppcheck \
                          cpplint \
                          cvecheck \
                          darglint \
                          dennis \
                          detectsecrets \
                          flake8 \
                          flawfinder \
                          flint \
                          gcc \
                          golint \
                          jsonlint \
                          kconfighard \
                          licensecheck \
                          looong \
                          msgcheck \
                          multimetric \
                          mypy \
                          oelint \
                          perl \
                          perlcritic \
                          pkgqaenc \
                          pscan \
                          pylint \
                          pysymcheck \
                          rats \
                          reuse \
                          revive \
                          ruff \
                          scancode \
                          setuptoolslint \
                          shellcheck \
                          slick \
                          sparse \
                          stank \
                          systemdlint \
                          tscancode \
                          vulture \
                          xmllint \
                          yamllint \
                        "

SCA_ENABLED_MODULES := "${SCA_ENABLED_MODULES_${SCA_MODE_UPPER}}"

SCA_HASHEXCLUDE_VARS = "\
                        __SCA_DATAMODEL_STORAGE \
                        SCA_DATAMODEL_STORAGE \
                        SCA_LAYERDIR \
                        SCA_SDKGEN_TASKS \
                        "

# some global vardepexcludes
LIC_FILES_CHKSUM[vardepsexclude] += "SCA_LAYERDIR"
