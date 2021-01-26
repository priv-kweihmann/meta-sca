SUMMARY = "NPM: tsutils"
DESCRIPTION = "utilities for working with typescript's AST"
HOMEPAGE = "https://github.com/ajafff/tsutils#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bbaf2d631ca7165076ef9bdf62d67abe"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/tsutils/-/tsutils-3.20.0.tgz"
SRC_URI[md5sum] = "c47b0b65aa4f4b8ed4e7f65a9fe1c3de"
SRC_URI[sha256sum] = "63048325ada715cababcc05660317a5415e0caa89711954cb50c81c6b42d163c"

NPM_PKGNAME = "tsutils"

inherit npmhelper
inherit native
