SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.14.0.tgz"
SRC_URI[md5sum] = "7bbbb342c776328de4f81cd0b3b38b8e"
SRC_URI[sha256sum] = "03a3e693aad430f4d2eff46b2e17d80e1b778479ff0ca7cbf261f0ee87d6e58e"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
