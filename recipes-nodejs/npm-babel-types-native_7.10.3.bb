SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.10.3.tgz"
SRC_URI[md5sum] = "7a566c8d43d0da0ce3b49b247242b8e4"
SRC_URI[sha256sum] = "944e446b423739f8e08926e3f6107359dab2bcfc1e819feed32260ce9ec99f7a"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
