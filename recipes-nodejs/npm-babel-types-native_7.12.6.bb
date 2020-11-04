SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.12.6.tgz"
SRC_URI[md5sum] = "c6eae964c24e8a82a89425087393fe37"
SRC_URI[sha256sum] = "23abab5ca6abcbfa59f776f8c63fbe52458f82865a81b23a15d5d09df588cd72"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
