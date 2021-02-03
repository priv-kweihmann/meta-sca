SUMMARY = "NPM: @babel/traverse"
DESCRIPTION = "The Babel Traverse module maintains the overall tree state, and is responsible for replacing, removing, and adding nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-traverse"

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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.12.13.tgz"
SRC_URI[md5sum] = "cba92dc1fa690a08b0973ce36cb0b3af"
SRC_URI[sha256sum] = "b4fcdc925b833ad532b6e68a276c6f1b9b5d26d07c63464c8f00dddc82f06be7"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
