SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.10.1.tgz"
SRC_URI[md5sum] = "206269e7d75a1c9e78714fc90d8ec7e8"
SRC_URI[sha256sum] = "0943ec770a8c0d0642559ba1737d702c30e565fb07f8ad3440f1d6080642fe61"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
