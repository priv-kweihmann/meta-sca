SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.10.0.tgz"
SRC_URI[md5sum] = "b74646e1415e5b18cf785401588268d1"
SRC_URI[sha256sum] = "3445b86f2937777872051ff866cfdbc7bf8be4c6f1cb0a9c1963b74e8535d4b0"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
