SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.13.10.tgz"
SRC_URI[md5sum] = "b6e78bcd14d2f031cdfd1f1ae349b459"
SRC_URI[sha256sum] = "19797609e1814e3d5a68f6859db1150ae979995ff0dfc9aca3d2e037df58e814"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
