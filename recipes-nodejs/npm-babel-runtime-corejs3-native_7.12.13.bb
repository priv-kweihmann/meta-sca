SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.12.13.tgz"
SRC_URI[md5sum] = "3eb689b22e491b4f8444e66f5152b5dd"
SRC_URI[sha256sum] = "2f4ee983afcf12caab42c879dfd0a263d168de9c070a12a1ce85c4038ded0445"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
