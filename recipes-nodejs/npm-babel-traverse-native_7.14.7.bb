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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.14.7.tgz"
SRC_URI[md5sum] = "68aad57f8c3c7dc16ac4c86f27bcdf0e"
SRC_URI[sha256sum] = "fbf9766d81c56e18a48bffaf3ef75865b45fd6914090394e5b599c5e9da17604"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
