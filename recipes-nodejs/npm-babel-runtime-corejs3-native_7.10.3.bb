SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.10.3.tgz"
SRC_URI[md5sum] = "7845070d7ee516751016671e130a6f59"
SRC_URI[sha256sum] = "63e0112d4e50fce255be7ad9b29f1d5e24aec5bc4326fb664a8f500f4cf06982"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
