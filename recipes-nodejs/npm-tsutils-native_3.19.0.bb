SUMMARY = "NPM: tsutils"
DESCRIPTION = "utilities for working with typescript's AST"
HOMEPAGE = "https://github.com/ajafff/tsutils#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bbaf2d631ca7165076ef9bdf62d67abe"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/tsutils/-/tsutils-3.19.0.tgz"
SRC_URI[md5sum] = "b5c62e5665c0b14e959db3d40d0d7206"
SRC_URI[sha256sum] = "82af6c171e3961978547a9c0011471280bf2673bf50d61830ddc3fada3a2da82"

NPM_PKGNAME = "tsutils"

inherit npmhelper
inherit native
