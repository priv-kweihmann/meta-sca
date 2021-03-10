SUMMARY = "NPM: tsutils"
DESCRIPTION = "utilities for working with typescript's AST"
HOMEPAGE = "https://github.com/ajafff/tsutils#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bbaf2d631ca7165076ef9bdf62d67abe"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/tsutils/-/tsutils-3.21.0.tgz"
SRC_URI[md5sum] = "dfb6c80fcec7b84ee3298c2f2d828ddc"
SRC_URI[sha256sum] = "ff68d0e14971d21dc9bbfd64a27be1c6c40ed253bb19170ef145f4d551f78a74"

NPM_PKGNAME = "tsutils"

inherit npmhelper
inherit native
