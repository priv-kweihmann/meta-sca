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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.13.0.tgz"
SRC_URI[md5sum] = "8a85f1b3a9e985d3fc5227dd5a2190dc"
SRC_URI[sha256sum] = "4707f7ddc7db567d18c6815ef8f5cbbb7381bd50f4aad504ed6abf8b06af9942"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
