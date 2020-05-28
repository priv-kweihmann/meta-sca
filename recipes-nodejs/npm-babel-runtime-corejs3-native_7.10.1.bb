SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.10.1.tgz"
SRC_URI[md5sum] = "903e002f945b7bfab6eb61a13ebac7e2"
SRC_URI[sha256sum] = "cec0220b7cc7510001491818e3031c6a0c2d39aed26dfce7cb46461c1f7cb36c"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
