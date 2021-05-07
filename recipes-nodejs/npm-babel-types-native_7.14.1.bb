SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.14.1.tgz"
SRC_URI[md5sum] = "d4d2210d4ff561547dad7e16487be1d8"
SRC_URI[sha256sum] = "6685485e6789f364aab975b2465e77e61b89d514ea2e5d741706751624e757dd"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
