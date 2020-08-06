SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.11.2.tgz"
SRC_URI[md5sum] = "af1dd583f6283da7167ae2259b68ee90"
SRC_URI[sha256sum] = "fba74ea3601c335f63e2cf173dfda7bc6c2ac4784ea1937e6d04cc45dec6c5d7"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
