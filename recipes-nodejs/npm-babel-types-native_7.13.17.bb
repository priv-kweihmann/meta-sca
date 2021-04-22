SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.13.17.tgz"
SRC_URI[md5sum] = "4874e682ae331e8fefd56f19fc981068"
SRC_URI[sha256sum] = "5d9b4f037998d194183af705bd76ee76fdc3600b94aeb16d38f1472f74fdec61"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
