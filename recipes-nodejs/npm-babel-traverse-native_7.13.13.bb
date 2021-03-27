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

SRC_URI = "https://registry.npmjs.org/@babel/traverse/-/traverse-7.13.13.tgz"
SRC_URI[md5sum] = "f2872e93eeaa29bc535c82dc8e9e44de"
SRC_URI[sha256sum] = "599d9b5b31089e4d7074ae86960f9ef547a76bc1182672ea33e5989c7d1687b7"

NPM_PKGNAME = "@babel/traverse"

inherit npmhelper
inherit native
