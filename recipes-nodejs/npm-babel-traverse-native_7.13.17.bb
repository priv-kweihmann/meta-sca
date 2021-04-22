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
           npm-globals-native"

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.13.17.tgz"
SRC_URI[md5sum] = "5f050a5963cd985dbfd79c04d5147b39"
SRC_URI[sha256sum] = "05fdc460694d7014532621d57d7a93ab6ae475d6e744c708e49d2442a5f0b7e0"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
