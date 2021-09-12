SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.15.6.tgz"
SRC_URI[md5sum] = "135db1a9defc0b5b898dbe0829073a32"
SRC_URI[sha256sum] = "66df1a0eb4c689ac835ce848d73c428022b3d9eb65db6ac750f5c4e2e34cd749"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
