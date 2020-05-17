## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-nonet-sanity

## Name of the package to be installed - if empty it looks for composer.json in S-dir
PHPCOMPOSER_PKGS_NAME ?= "${BPN}:${PV}"
## Install dir
PHPCOMPOSER_INSTALLDIR ?= "${bindir}/${BPN}"
## Additional args for composer require (see their man page for details)
PHPCOMPOSER_ADD_ARGS_REQUIRE ?= "--no-suggest"
## Cache dir
PHPCOMPOSER_CACHE_DIR_NAME ?= "composer_cache"
PHPCOMPOSER_CACHE_DIR_BASE ?= "${WORKDIR}"
PHPCOMPOSER_CACHE_DIR ?= "${WORKDIR}/${PHPCOMPOSER_CACHE_DIR_NAME}"

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
    export COMPOSER_HOME=${STAGING_DATADIR_NATIVE}/composer
    export COMPOSER_CACHE_DIR=${PHPCOMPOSER_CACHE_DIR}
    composer.phar require -vv \
        ${PHPCOMPOSER_ADD_ARGS_REQUIRE} ${PHPCOMPOSER_PKGS_NAME}
    cd -
    mkdir -p ${D}${PHPCOMPOSER_INSTALLDIR}
    cp -Ra ${B}/* ${D}${PHPCOMPOSER_INSTALLDIR}/
}

EXPORT_FUNCTIONS do_install do_configure do_compile
