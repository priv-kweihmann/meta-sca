SUMMARY = "NPM: tsutils"
DESCRIPTION = "utilities for working with typescript's AST"
HOMEPAGE = "https://github.com/ajafff/tsutils#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bbaf2d631ca7165076ef9bdf62d67abe"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/tsutils/-/tsutils-3.18.0.tgz"
SRC_URI[md5sum] = "9f7c55707e84fce926078d37c4ea0dad"
SRC_URI[sha256sum] = "44ab0c381b282c498df81f407ff812356aa63027fccf629149b9a555dd121f24"

NPM_PKGNAME = "tsutils"

inherit npmhelper
inherit native
