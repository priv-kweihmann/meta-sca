SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.10.4.tgz"
SRC_URI[md5sum] = "870b36ca448962a03a4038eba487b91b"
SRC_URI[sha256sum] = "5c147d0bb1af9b5e6c6b966ee54da346aee33cfbec9e32407adeb9161aec8e9c"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
