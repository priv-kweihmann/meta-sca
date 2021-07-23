SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.14.8.tgz"
SRC_URI[md5sum] = "5ec3a3cb5a86cbb239364579fcdefefc"
SRC_URI[sha256sum] = "7c88c7358a6a86e05cfcb1e1307b0bac0bb1da7495e3cc3187685dcd89edf097"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
