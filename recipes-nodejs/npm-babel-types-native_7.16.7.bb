SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.16.7.tgz"
SRC_URI[md5sum] = "3d2f78c8c7ab8da7ff5f055fba4f75f5"
SRC_URI[sha256sum] = "b234baa2e364d06a1c9585db14451a4549db482dcab57f9bb87bed9f0c80b9d0"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
