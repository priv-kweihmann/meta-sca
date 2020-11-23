SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.12.7.tgz"
SRC_URI[md5sum] = "da7e321ef971652820dbf2d4aa247001"
SRC_URI[sha256sum] = "5a1342ce6184b56840c7d92fa75548a0e081d2990b8960497d002f67b671e3e8"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
