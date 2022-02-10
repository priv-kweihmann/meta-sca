SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.17.2.tgz"
SRC_URI[md5sum] = "613f266f94f697423bb89e45a527fb26"
SRC_URI[sha256sum] = "791728fad0056e58775e71e8cd17d66bf1ac8d3aa9de9e418fba3507d10f4f49"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
