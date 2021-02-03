SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.12.13.tgz"
SRC_URI[md5sum] = "3ce6b4a1e29cf8b4ef61d92e899b05a0"
SRC_URI[sha256sum] = "2843deaf5baef5bacee86f17b2814c64668a42fba87c8e0a14f7e224022458d5"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
