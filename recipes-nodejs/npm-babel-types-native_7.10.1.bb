SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.10.1.tgz"
SRC_URI[md5sum] = "0ed67a3e9df2abc0edbdc0c6d17bffdd"
SRC_URI[sha256sum] = "bcfe507e209a7b9a69a3ff3b11edda741777b7fb7dc54a3049db20438ac86877"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
