SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.10.5.tgz"
SRC_URI[md5sum] = "7a1db06fe3cc0913e2ebb382d5425701"
SRC_URI[sha256sum] = "a6ed0d7c5ccd1a4256f2853d36dfd4d1b961b7073f6c0b44d696a8a42ac58a4a"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
