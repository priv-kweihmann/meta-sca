SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.13.9.tgz"
SRC_URI[md5sum] = "ba0aeac119662ef6ea209461081421c1"
SRC_URI[sha256sum] = "797c479cdf93e1704565a365a0a8e4e8a7e2add3c6cf6344fb6933af84658b87"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
