## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

## Name of the package to be installed - if empty it looks for composer.json in S-dir
PHPCOMPOSER_PKGS_NAME ?= "${BPN}:${PV}"
## Install dir
PHPCOMPOSER_INSTALLDIR ?= "${bindir}/${BPN}"
## Additional args for composer require (see their man page for details)
PHPCOMPOSER_ADD_ARGS_REQUIRE ?= "--no-suggest"

DEPENDS += "composer-native"

B = "${WORKDIR}/build"

phpcomposer_do_configure() {
    :
}

phpcomposer_do_compile() {
    rm -rf ${B}/*
}

phpcomposer_do_install() {
    cd ${B}
    composer.phar require -vv --no-cache \
        ${PHPCOMPOSER_ADD_ARGS_REQUIRE} ${PHPCOMPOSER_PKGS_NAME}
    cd -
    mkdir -p ${D}${PHPCOMPOSER_INSTALLDIR}
    cp -Ra ${B}/* ${D}${PHPCOMPOSER_INSTALLDIR}/
}

EXPORT_FUNCTIONS do_install do_configure do_compile