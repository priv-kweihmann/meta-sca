SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.14.5.tgz"
SRC_URI[md5sum] = "e85322cb9e467594c176a2113f73915a"
SRC_URI[sha256sum] = "b860bf6d3055fbf25860d9734c1309193333a5abe69a2174feeae93ecb6510f0"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
