SUMMARY = "NPM: @babel/traverse"
DESCRIPTION = "The Babel Traverse module maintains the overall tree state, and is responsible for replacing, removing, and adding nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-traverse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-generator-native \
           npm-babel-helper-function-name-native \
           npm-babel-helper-hoist-variables-native \
           npm-babel-helper-split-export-declaration-native \
           npm-babel-parser-native \
           npm-babel-types-native \
           npm-debug-native \
           npm-globals-native"

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.15.0.tgz"
SRC_URI[md5sum] = "7756c47d002fc85cb192eaed91a70aed"
SRC_URI[sha256sum] = "f117c8dadc22fd3f436d8ffacf6ea2369095e8b4d9bb0dc026851fc53688eca3"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
