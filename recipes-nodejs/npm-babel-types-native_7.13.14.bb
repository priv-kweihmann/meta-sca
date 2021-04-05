SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.13.14.tgz"
SRC_URI[md5sum] = "5f0761f2fea0c900575a636f4c600880"
SRC_URI[sha256sum] = "74860d2d703d29c4c0638720f991ef17b777d7ed0229736ece88ac90f742947f"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
