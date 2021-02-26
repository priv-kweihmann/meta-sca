SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.13.7.tgz"
SRC_URI[md5sum] = "ca12dce4f8a67561274f9f15e5c2491e"
SRC_URI[sha256sum] = "587b7e3cff369d91d51a057eee726c5aba006f1210c12484c8ec591bdddbd1d3"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
