SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.14.6.tgz"
SRC_URI[md5sum] = "23d222407561b50e6b9b168996d6edad"
SRC_URI[sha256sum] = "6e36075556f821a01aebe669fdfcc6ddd0964a679c84dc99bcbf34ecc4f9cf91"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
