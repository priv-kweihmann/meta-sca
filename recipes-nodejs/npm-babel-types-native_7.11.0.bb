SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.11.0.tgz"
SRC_URI[md5sum] = "5dc90502c56b03a257973aef316566a2"
SRC_URI[sha256sum] = "8297fc96f19f58dd529f521f5d324cc4aee644e368958f15a8fa0062960049a7"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
