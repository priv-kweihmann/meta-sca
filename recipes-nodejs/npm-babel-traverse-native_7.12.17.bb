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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.12.17.tgz"
SRC_URI[md5sum] = "2081e3295c5324a4ea6a137caa8dd14c"
SRC_URI[sha256sum] = "e86afbb24c43c0c9fa28cb4704de51aea683fc1881c5bebc7471d6212bd5d6ec"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
