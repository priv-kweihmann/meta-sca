## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

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

## Shebang for python interpreter
SCA_PYTHON_SHEBANG = ".*${SCA_STD_PYTHON_INTERPRETER}"

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

## NOTE: To due an issue in setuptools, it's impossible to install
## ansiblelint at the moment.
## An official release from the project is not yet released to pypi
## so ansiblelint can't be installed to master or zeus branch

## List of overall available modules
SCA_AVAILABLE_MODULES ?= "\
                          alexkohler \
                          ansible \
                          bandit \
                          bashate \
                          bitbake \
                          cbmc \
                          checkbashism \
                          configcheck \
                          cppcheck \
                          cpplint \
                          cqmetrics \
                          cspell \
                          cvecheck \
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
                          gosec \
                          govet \
                          htmlhint \
                          jsonlint \
                          kconfighard \
                          looong \
                          lynis \
                          npmaudit \
                          msgcheck \
                          mypy \
                          oelint \
                          proselint \
                          pyfindinjection \
                          pylint \
                          pyright \
                          pysymcheck \
                          pytype \
                          radon \
                          rats \
                          retire \
                          revive \
                          ropgadget \
                          safety \
                          shellcheck \
                          slick \
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
                          zrd"

SCA_ENABLED_MODULES := "${SCA_ENABLED_MODULES_${SCA_MODE_UPPER}}"