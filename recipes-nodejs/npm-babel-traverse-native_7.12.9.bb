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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.12.9.tgz"
SRC_URI[md5sum] = "ee3458426bae1001d7edf56cde1cd943"
SRC_URI[sha256sum] = "3cac0fd8c7b5c1155e861e0dd184ebed78d915b3044f4e496c6712ba5a5db7fa"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
