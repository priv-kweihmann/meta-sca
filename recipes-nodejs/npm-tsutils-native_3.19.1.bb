SUMMARY = "NPM: tsutils"
DESCRIPTION = "utilities for working with typescript's AST"
HOMEPAGE = "https://github.com/ajafff/tsutils#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bbaf2d631ca7165076ef9bdf62d67abe"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/tsutils/-/tsutils-3.19.1.tgz"
SRC_URI[md5sum] = "af03a421bf91b28b9553cdcb46bf02db"
SRC_URI[sha256sum] = "596cadd93bf1b3f0413f94c338885ae9b702802d18876d5681e9343c5f2425dc"

NPM_PKGNAME = "tsutils"

inherit npmhelper
inherit native
