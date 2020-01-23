## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-globalfunc

SCA_ENABLE ?= "1"
SCA_EXPORT_DIR ?= "${DEPLOY_DIR_IMAGE}/sca"
SCA_EXPORT_FINDING_SRC = "1"
SCA_EXPORT_FINDING_DIR ?= "${DEPLOY_DIR_IMAGE}/sca/sources/${PN}/"

## Valid values are 'checkstyle' or 'console' or 'diff'
SCA_EXPORT_FORMAT ?= "checkstyle"
SCA_EXPORT_FORMAT_SUFFIX_checkstyle = "xml"
SCA_EXPORT_FORMAT_SUFFIX_console = "txt"
SCA_EXPORT_FORMAT_SUFFIX_diff = "txt"

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

## Force run of SCA
SCA_FORCE_RUN ??= "0"

## Verbose output of SCA invocation
SCA_VERBOSE_OUTPUT ??= "0"

## Filter by scope
SCA_SCOPE_FILTER ?= "security functional style"

## List of rules for transforming severity
## example: pylint.pylint.C0103=error
SCA_SEVERITY_TRANSFORM ?= ""

## List of overall available modules
SCA_AVAILABLE_MODULES ?= "\
                          alexkohler \
                          ansible \
                          ansiblelint \
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
                          golint \
                          govet \
                          htmlhint \
                          jshint \
                          jsonlint \
                          kconfighard \
                          looong \
                          lynis \
                          msgcheck \
                          multimetric \
                          mypy \
                          nixauditor \
                          npmaudit \
                          oelint \
                          perl \
                          perlcritic \
                          proselint \
                          pscan \
                          pyfindinjection \
                          pylint \
                          pyright \
                          pysymcheck \
                          pytype \
                          rats \
                          reek \
                          retire \
                          revive \
                          ropgadget \
                          safety \
                          setuptoolslint \
                          shellcheck \
                          sparse \
                          splint \
                          standard \
                          stank \
                          stylelint \
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
                          zrd \
                        "

SCA_ENABLED_MODULES := "${SCA_ENABLED_MODULES_${SCA_MODE_UPPER}}"