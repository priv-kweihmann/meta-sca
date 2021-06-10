SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.14.5.tgz"
SRC_URI[md5sum] = "777d499b1b45536f6c67916a8e68cd69"
SRC_URI[sha256sum] = "426a49897db051ed995127ed6808f7789cc53c0f0ce8e5821c01103c026a3b14"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
