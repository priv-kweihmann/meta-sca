SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.14.8.tgz"
SRC_URI[md5sum] = "31135f68bbc25751da583a7473f968a6"
SRC_URI[sha256sum] = "06e984ee3e63151da74d822c6211d16774f5b23b16ed5f1a8d9e161409b03ba2"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
