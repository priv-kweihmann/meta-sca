SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.12.1.tgz"
SRC_URI[md5sum] = "a82c1b764d9a846022fef3fcfb884bc8"
SRC_URI[sha256sum] = "328a9987242e6d1cac65aa1813a195780daf6f18aa0070a8cd00cdbe8a1764ed"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
