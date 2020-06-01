SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.10.2.tgz"
SRC_URI[md5sum] = "0f51f6365aaca0640802f2f0c5b0c30b"
SRC_URI[sha256sum] = "90af90b851680ea03d3e5bc87a2cbd73295e2c81058cc708ec048e25245d980f"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
