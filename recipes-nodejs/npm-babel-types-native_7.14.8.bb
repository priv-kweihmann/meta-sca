SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.14.8.tgz"
SRC_URI[md5sum] = "241511addb278477e19a90ddd6fdd619"
SRC_URI[sha256sum] = "121ff7b8aaacb77a47a0f28f374d13558fe25e313bdc467dd8c94de6ae1a583b"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
