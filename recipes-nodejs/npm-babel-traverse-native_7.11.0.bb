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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.11.0.tgz"
SRC_URI[md5sum] = "7cfddf0e95b3e91b12365d1d84ea01fd"
SRC_URI[sha256sum] = "9752411f88758db802c59cb779e3f0844d9675bc412945be287a30711f1455a3"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
