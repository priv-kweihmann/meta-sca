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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.10.1.tgz"
SRC_URI[md5sum] = "06a41ab1366aab628a73eff29f62f15d"
SRC_URI[sha256sum] = "eea8ac08eaef21ce4b9391396efa6632d030ef9eb86adc1a5fa360cc90e77581"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
