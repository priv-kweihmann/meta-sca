SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.15.0.tgz"
SRC_URI[md5sum] = "1e270c02ae096c6a4b7faffc92f74077"
SRC_URI[sha256sum] = "dfe8b2d3d6418708b04a918842d12ac4c9189115b2bc3685cc8f26b3c84dbb76"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
