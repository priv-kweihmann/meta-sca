SUMMARY = "NPM: @babel/traverse"
DESCRIPTION = "The Babel Traverse module maintains the overall tree state, and is responsible for replacing, removing, and adding nodes"
HOMEPAGE = "https://babeljs.io/"

DEPENDS = "npm-babel-code-frame-native npm-babel-generator-native npm-babel-helper-function-name-native npm-babel-helper-split-export-declaration-native npm-babel-parser-native npm-babel-types-native npm-debug-native npm-globals-native npm-lodash-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.9.6.tgz"
SRC_URI[md5sum] = "74a8bdbcd79ef3f0f59eeea858a2374c"
SRC_URI[sha256sum] = "c0e5f4135fcd5f2204baf4c6e5baca4aa23179ac97263028e5149bdbe005a79e"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
