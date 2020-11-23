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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.12.7.tgz"
SRC_URI[md5sum] = "d06e5bc3f1605cbb4ff8e2590db20df5"
SRC_URI[sha256sum] = "133d47971c681778c825a027d7842863397dca3539fa34dba029315b9be0c601"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
