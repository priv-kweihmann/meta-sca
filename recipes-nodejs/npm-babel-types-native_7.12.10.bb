SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.12.10.tgz"
SRC_URI[md5sum] = "26219619726b9eba3572259c8f518cca"
SRC_URI[sha256sum] = "71365ab99aa3932c80759bf2aa734243fe1e0fe61165ecd64e6bc9772b7a15f6"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
