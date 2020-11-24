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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.12.8.tgz"
SRC_URI[md5sum] = "b15db0b90dac835b73867004071f8fb2"
SRC_URI[sha256sum] = "8e9eb5fe1d74e91d5c48ac24219ad237ba6fcb2fe15a83d027c4b2ed261b9748"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
