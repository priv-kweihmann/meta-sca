SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.12.18.tgz"
SRC_URI[md5sum] = "dcbc7b9573958ed201fd7b3f2d2ac65d"
SRC_URI[sha256sum] = "c2e298519a3bf4001f3d9201a2f5e36385720e7d7ec63bbe4b028f4440bb190d"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
