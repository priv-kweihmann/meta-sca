SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
DEPENDS = "npm-core-js-pure-native npm-regenerator-runtime-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.9.6.tgz"
SRC_URI[md5sum] = "e64feb0895225c68267071a8ccce4c26"
SRC_URI[sha256sum] = "609ded88568f89ac56476e8ac9f8627dc51db0741f75d041b1d4d1e2aa0954a3"

S = "${WORKDIR}/package"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
