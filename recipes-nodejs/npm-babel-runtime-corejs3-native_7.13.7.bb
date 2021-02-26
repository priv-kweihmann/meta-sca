SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.13.7.tgz"
SRC_URI[md5sum] = "6a992a0ed9417f9b4ef7e9a5073ac609"
SRC_URI[sha256sum] = "52875b72ed581e7f74da0cb871a297bc681c99a5d9be9817e6956ec6f3683390"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
