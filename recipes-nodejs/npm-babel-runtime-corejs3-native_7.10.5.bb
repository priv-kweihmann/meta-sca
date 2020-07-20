SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.10.5.tgz"
SRC_URI[md5sum] = "f3d2ae40f9e4e984560163993d7711d8"
SRC_URI[sha256sum] = "6661067be552e6e00264eb731836e48f78d400d48fc07d19bb803e613673978e"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
