SUMMARY = "NPM: @babel/core"
DESCRIPTION = "Babel compiler core."
HOMEPAGE = "https://babeljs.io/"

DEPENDS = "npm-babel-code-frame-native npm-babel-generator-native npm-babel-helper-module-transforms-native npm-babel-helpers-native npm-babel-parser-native npm-babel-template-native npm-babel-traverse-native npm-babel-types-native npm-convert-source-map-native npm-debug-native npm-gensync-native npm-json5-native npm-lodash-native npm-resolve-native npm-semver-native npm-source-map-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/core/-/core-7.9.6.tgz"
SRC_URI[md5sum] = "ecc47d2b231e8228dfe3d6196884fa2d"
SRC_URI[sha256sum] = "67929617f4a776af142ef13cdef8d6d101a6dcb277212b4f541889ef4eb46bb1"

NPM_PKGNAME = "@babel/core"

inherit npmhelper
inherit native
