SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.14.5.tgz"
SRC_URI[md5sum] = "def569565ce63da824b90f43ac727806"
SRC_URI[sha256sum] = "a87b4ee1294a7c8e481ac735c97d9fd4c7d1e90c8f20060a075c93134b425e99"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
