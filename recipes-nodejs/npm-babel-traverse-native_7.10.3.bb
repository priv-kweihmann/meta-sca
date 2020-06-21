SUMMARY = "NPM: @babel/traverse"
DESCRIPTION = "The Babel Traverse module maintains the overall tree state, and is responsible for replacing, removing, and adding nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-generator-native \
           npm-babel-helper-function-name-native \
           npm-babel-helper-split-export-declaration-native \
           npm-babel-parser-native \
           npm-babel-types-native \
           npm-debug-native \
           npm-globals-native \
           npm-lodash-native"

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.10.3.tgz"
SRC_URI[md5sum] = "a4d904a8747fa2a621a9ebb7cba8e211"
SRC_URI[sha256sum] = "c6232d0216c8f7d41450467e16e4956202502f0c68db2168bcdb89c085bdc90e"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
