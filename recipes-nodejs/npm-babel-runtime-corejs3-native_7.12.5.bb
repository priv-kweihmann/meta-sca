SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.12.5.tgz"
SRC_URI[md5sum] = "91f73207a3bd9046515c56dd573282d9"
SRC_URI[sha256sum] = "56a47ed1127ed0738d4287ab0b906d89ea27b07feda5b0021b76493372c56422"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
