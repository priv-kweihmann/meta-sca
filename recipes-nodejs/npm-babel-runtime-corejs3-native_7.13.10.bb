SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.13.10.tgz"
SRC_URI[md5sum] = "3cf9be6db7ab634dadd221d5b79b8dbc"
SRC_URI[sha256sum] = "bc1e20396f23aaa4ed9dbf7e627759bf8fef5c55966ff42933189fa4bb36a3b5"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
