SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.10.5.tgz"
SRC_URI[md5sum] = "d24b28211f883b69404ec85c9b59220b"
SRC_URI[sha256sum] = "0e5145c3ce440d59316a6d7d1784ed699fb16bb65bc1a1d43aa7ad7e3b06b8f7"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
