SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.15.4.tgz"
SRC_URI[md5sum] = "355cf7b19096f3577af8f96234e3538e"
SRC_URI[sha256sum] = "67f4d5b201eccf7a7a4844b45662a8ddf810dca21134dad26bb50fdf125f3c62"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
