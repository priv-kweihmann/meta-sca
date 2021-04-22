SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.13.17.tgz"
SRC_URI[md5sum] = "f69e03ac3ba1f46b155f1808e0014eaf"
SRC_URI[sha256sum] = "c257db7f0c2582435a30690a2a46a474a68c614586bf6e480a6dc5cb42b10c8c"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
