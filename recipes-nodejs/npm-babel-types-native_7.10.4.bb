SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.10.4.tgz"
SRC_URI[md5sum] = "120944ed0ef7399b7f2a71cb5d334469"
SRC_URI[sha256sum] = "f4e2f932c9d7c05c7d1a4a5ed3978d2faada14cca3c0ac21b0f9b6c1b66c1499"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
