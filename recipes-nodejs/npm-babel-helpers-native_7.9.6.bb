SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babeljs.io/"

DEPENDS = "npm-babel-template-native npm-babel-traverse-native npm-babel-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.9.6.tgz"
SRC_URI[md5sum] = "cd34cf47ed69c5ad53d2de7fe0191e25"
SRC_URI[sha256sum] = "d3c284a27e41d8344d4009a8f13ea615709d16789fe1be23468908a85b095f24"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
