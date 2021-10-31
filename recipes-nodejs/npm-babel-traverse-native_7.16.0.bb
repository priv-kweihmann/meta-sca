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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.16.0.tgz"
SRC_URI[md5sum] = "2389af97cd9304cc6fe1724a8cd98991"
SRC_URI[sha256sum] = "266e39ea1bdffd3795968746ee4613c58ce6b65eaa663e8dd821842c853eddcc"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
