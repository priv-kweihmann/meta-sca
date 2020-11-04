SUMMARY = "NPM: @babel/helper-module-imports"
DESCRIPTION = "Babel helper functions for inserting module loads"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-imports/-/helper-module-imports-7.12.5.tgz"
SRC_URI[md5sum] = "209cb4f8194538a3ae2715ca5b1e29ae"
SRC_URI[sha256sum] = "dc1a06db52d9c118c39eb3db0d3b691673e73f5f5dcd064d45dcee9707139856"

NPM_PKGNAME = "@babel/helper-module-imports"

inherit npmhelper
inherit native
