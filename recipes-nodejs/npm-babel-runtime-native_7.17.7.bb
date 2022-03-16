SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.17.7.tgz"
SRC_URI[md5sum] = "951a91e54aa1807556ce0a877dd284f4"
SRC_URI[sha256sum] = "38a945737ae83ea0d7dbb333a81a426f3f682c0d22b436c4b2d62935a7b631b8"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
