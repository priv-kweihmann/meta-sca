SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.12.12.tgz"
SRC_URI[md5sum] = "47f4032300177da5ffe5d10b5498a6b3"
SRC_URI[sha256sum] = "ca446711fd5f3ad0e215679a3096d07ee5262e42845dc53e1b004cc8c1dc450e"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
