SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.14.7.tgz"
SRC_URI[md5sum] = "2b0752e892135b76a4542ca3c0240332"
SRC_URI[sha256sum] = "68ffd2b5531b71ae3c0834e074273390e77fce6d3a2d84cf5bf78246d71b2e05"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
