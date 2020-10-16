SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.12.1.tgz"
SRC_URI[md5sum] = "9d9c61119b1a932f1db3102f64d4b0d4"
SRC_URI[sha256sum] = "98bc7e7556ee206ce2c3d43f03925d3329a1ace9d9a6cf790b6e769ae792a387"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
