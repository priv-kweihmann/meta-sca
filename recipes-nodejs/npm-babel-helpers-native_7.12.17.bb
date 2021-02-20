SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.12.17.tgz"
SRC_URI[md5sum] = "b9359cedae49a33ed7c88e04acd9b89a"
SRC_URI[sha256sum] = "c6f10179f405fb929653faaa42a78313f92ddcc361e42807c9ea5bf77d7809af"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
