## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-nonet-sanity

## This class provides an interface for using luarocks
## in bitbake
DEPENDS += "lua-native luarocks-native"

## Install dir
LUAROCKS_INSTALL_DIR ?= "${D}/${prefix}"
## Package name
LUAROCKS_INSTALL_PKG_NAME ?= "${BPN}"
## Package version
LUAROCKS_INSTALL_PKG_VERSION ?= "${PV}"

LUAROCKS_INCDIR:class-native ?= "${STAGING_INCDIR_NATIVE}"
LUAROCKS_INCDIR:class-target ?= "${STAGING_INCDIR}"

luarocks_do_configure() {
    :
}

luarocks_do_compile() {
    :
}

luarocks_do_configure[noexec] = "1"
luarocks_do_compile[noexec] = "1"

luarocks_do_install() {
    lua ${STAGING_BINDIR_NATIVE}/luarocks \
        --tree ${LUAROCKS_INSTALL_DIR} \
        LUA_INCDIR=${LUAROCKS_INCDIR} \
        --lua-dir=${STAGING_BINDIR_NATIVE} install \
        ${LUAROCKS_INSTALL_PKG_NAME} ${LUAROCKS_INSTALL_PKG_VERSION}
}

FILES:${PN} = "${prefix}"

EXPORT_FUNCTIONS do_install do_configure do_compile
