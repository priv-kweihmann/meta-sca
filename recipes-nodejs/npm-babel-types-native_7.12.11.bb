SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.12.11.tgz"
SRC_URI[md5sum] = "798acae3e70825be8d4778dc65bf0d45"
SRC_URI[sha256sum] = "7cfbf5a5c1a8bc885dbabc2759f1d75f403aced3c5b37554d7159ed8ee70c182"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
