SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.11.0.tgz"
SRC_URI[md5sum] = "58a2b760b1c36b981242d834d3a8a903"
SRC_URI[sha256sum] = "3a7639972ee8d12ac246abb783a9a97af0d9c763102f075afced033b009b2c5a"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
