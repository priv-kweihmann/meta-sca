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
                          bandit \
                          bashate \
                          bitbake \
                          cbmc \
                          checkbashism \
                          checksec \
                          cmake \
                          configcheck \
                          cppcheck \
                          cpplint \
                          darglint \
                          dennis \
                          detectsecrets \
                          flake8 \
                          flawfinder \
                          flint \
                          gcc \
                          goconsistent \
                          goconst \
                          golicensecheck \
                          golint \
                          gosec \
                          it \
                          jsonlint \
                          kconfighard \
                          looong \
                          lse \
                          lynis \
                          msgcheck \
                          mypy \
                          nixauditor \
                          oelint \
                          perl \
                          perlcritic \
                          pkgqaenc \
                          proselint \
                          protolint \
                          pscan \
                          pyfindinjection \
                          pylint \
                          pysymcheck \
                          pytype \
                          rats \
                          reconbf \
                          reuse \
                          revive \
                          safety \
                          semgrep \
                          setuptoolslint \
                          shellcheck \
                          slick \
                          sparse \
                          stank \
                          sudokiller \
                          systemdlint \
                          tiger \
                          tscancode \
                          upc \
                          vulture \
                          xmllint \
                          yamllint \
                          yara \
                        "
# additional layer requirements
SCA_AVAILABLE_MODULES[clang] = "clang-layer"
SCA_AVAILABLE_MODULES[cspell] = "openembedded-layer"
SCA_AVAILABLE_MODULES[eslint] = "openembedded-layer"
SCA_AVAILABLE_MODULES[htmlhint] = "openembedded-layer"
SCA_AVAILABLE_MODULES[inspec] = "openembedded-layer rubygems"
SCA_AVAILABLE_MODULES[jshint] = "openembedded-layer"
SCA_AVAILABLE_MODULES[luacheck] = "openembedded-layer"
SCA_AVAILABLE_MODULES[npmaudit] = "openembedded-layer"
SCA_AVAILABLE_MODULES[phan] = "openembedded-layer"
SCA_AVAILABLE_MODULES[phpcodefixer] = "openembedded-layer"
SCA_AVAILABLE_MODULES[phpcodesniffer] = "openembedded-layer"
SCA_AVAILABLE_MODULES[phpmd] = "openembedded-layer"
SCA_AVAILABLE_MODULES[phpsecaudit] = "openembedded-layer"
SCA_AVAILABLE_MODULES[phpstan] = "openembedded-layer"
SCA_AVAILABLE_MODULES[pyright] = "openembedded-layer"
SCA_AVAILABLE_MODULES[reek] = "rubygems"
SCA_AVAILABLE_MODULES[retire] = "openembedded-layer"
SCA_AVAILABLE_MODULES[rubycritic] = "rubygems"
SCA_AVAILABLE_MODULES[secretlint] = "openembedded-layer"
SCA_AVAILABLE_MODULES[standard] = "openembedded-layer"
SCA_AVAILABLE_MODULES[stylelint] = "openembedded-layer"
SCA_AVAILABLE_MODULES[textlint] = "openembedded-layer"
SCA_AVAILABLE_MODULES[wotan] = "openembedded-layer"

# Modules using crossemu support, because they need some extra "love"
_SCA_CROSSEMU_MODULES = "\
    checksec \
    configcheck \
    inspec \
    lse \
    lynis \
    nixauditor \
    reconbf \
    sudokiller \
    tiger \
"

SCA_ENABLED_MODULES := "${SCA_ENABLED_MODULES_${SCA_MODE_UPPER}}"

SCA_HASHEXCLUDE_VARS = "\
                        __SCA_DATAMODEL_STORAGE \
                        SCA_DATAMODEL_STORAGE \
                        SCA_LAYERDIR \
                        "
