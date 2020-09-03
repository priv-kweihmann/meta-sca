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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.11.5.tgz"
SRC_URI[md5sum] = "8b876ed60a1f25a5b94f7cebb8307609"
SRC_URI[sha256sum] = "c37a863ecd3b1362a894a4b944a087da224ec9d679b6286296d7893fb88dc1ab"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
