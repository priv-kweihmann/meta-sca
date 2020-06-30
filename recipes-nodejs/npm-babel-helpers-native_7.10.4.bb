SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.10.4.tgz"
SRC_URI[md5sum] = "804f397da74caff0ec78f7dc51b3bfb9"
SRC_URI[sha256sum] = "fa3c67ca24caf3e9cafa589cdb273acb4f6fd5afdf76cd7463467315e212ae2c"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
