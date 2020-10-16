SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.12.1.tgz"
SRC_URI[md5sum] = "4f4cfbaea3dc52b0f681648bd30d25e7"
SRC_URI[sha256sum] = "92810db2603c7b0e0c3d2b1b6c5041bd8fa0f66b9275dde3ea0946882bfceff5"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
