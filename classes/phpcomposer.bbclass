## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

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
PHPCOMPOSER_TAR_FILENAME = "caches_${BPN}-${PV}.tar.gz"

SRC_URI += "file://caches_${BPN}-${PV}.tar.gz"

DEPENDS += "composer-native"

python __anonymous() {
    import os
    import subprocess

    found = False
    for _dir in d.getVar("FILESPATH").split(":"):
        if os.path.exists(os.path.join(_dir, d.getVar("PHPCOMPOSER_TAR_FILENAME"))):
            if os.stat(os.path.join(_dir, d.getVar("PHPCOMPOSER_TAR_FILENAME"))).st_size != 0:
                found = True
                break
    if not found:
        d.setVar("NPM_EXTRA_ARGS", "--package-lock")
        for _dir in d.getVar("FILESPATH").split(":"):
            if os.path.exists(_dir):
                try:
                    subprocess.check_call(["tar", 
                                            "cvzf", 
                                            os.path.join(_dir, d.getVar("PHPCOMPOSER_TAR_FILENAME")),
                                            "-T", "/dev/null"])
                except subprocess.CalledProcessError as e:
                    bb.error(str(e))
                break
}

# This function do create a dump of all
# dependencies into a tarball
python do_package_refresh() {
    import os
    import subprocess

    for _dir in d.getVar("FILESPATH").split(":"):
        if os.path.exists(_dir):
            try:
                subprocess.check_call(["tar", 
                                       "cvzf", 
                                       os.path.join(_dir, d.getVar("PHPCOMPOSER_TAR_FILENAME")),
                                       "-C", d.getVar("PHPCOMPOSER_CACHE_DIR_BASE"),
                                       d.getVar("PHPCOMPOSER_CACHE_DIR_NAME")])
            except subprocess.CalledProcessError as e:
                bb.error(str(e))
            break;
}

## Requires install
do_package_refresh[depends] += "${PN}:do_install"
addtask do_package_refresh

B = "${WORKDIR}/build"

phpcomposer_do_configure() {
    :
}

phpcomposer_do_compile() {
    rm -rf ${B}/*
}

phpcomposer_do_install() {
    cd ${B}
    export COMPOSER_CACHE_DIR=${PHPCOMPOSER_CACHE_DIR}
    composer.phar require -vv \
        ${PHPCOMPOSER_ADD_ARGS_REQUIRE} ${PHPCOMPOSER_PKGS_NAME}
    cd -
    mkdir -p ${D}${PHPCOMPOSER_INSTALLDIR}
    cp -Ra ${B}/* ${D}${PHPCOMPOSER_INSTALLDIR}/
}

EXPORT_FUNCTIONS do_install do_configure do_compile