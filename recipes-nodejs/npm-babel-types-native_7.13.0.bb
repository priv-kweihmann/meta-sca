SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.13.0.tgz"
SRC_URI[md5sum] = "ece23ad67149e72d7a639d84742f6000"
SRC_URI[sha256sum] = "090217033eff6e6d229a9db4a55e2b45398315907b260116bcb9e004f19c80a0"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
