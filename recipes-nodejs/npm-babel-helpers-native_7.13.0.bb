SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.13.0.tgz"
SRC_URI[md5sum] = "d986416363fa035db80d792b8eb25c6c"
SRC_URI[sha256sum] = "e749c9b15a3e853aed9619aff0c8aff26c55c9c59b36f1650555628d76358d71"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
