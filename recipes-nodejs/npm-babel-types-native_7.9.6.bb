SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

DEPENDS = "npm-babel-helper-validator-identifier-native npm-lodash-native npm-to-fast-properties-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.9.6.tgz"
SRC_URI[md5sum] = "c658f37a59dcd979ce5f7a69193aa55d"
SRC_URI[sha256sum] = "d24cfc1e12377a7524894a4df44be3bad5eb1fadbf30d92e2ba089fa195ce64c"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
