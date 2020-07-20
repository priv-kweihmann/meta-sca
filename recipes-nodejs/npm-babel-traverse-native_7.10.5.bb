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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.10.5.tgz"
SRC_URI[md5sum] = "a9ff7e8486c26bec3bd8e558bf19be68"
SRC_URI[sha256sum] = "c20a466f3879aeea190ea7d729104c9c45e49f2425a16776edd3fd9ac88a6ae1"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
