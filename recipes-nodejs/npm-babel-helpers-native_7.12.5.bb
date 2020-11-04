SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.12.5.tgz"
SRC_URI[md5sum] = "51c76d3bd0397878ee11ccd30b26b31d"
SRC_URI[sha256sum] = "c923d96fff8e47eb6b6ffb03909e63c09da95df042cab06f6dee6f48c8b0e4ad"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
