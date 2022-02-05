SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.17.0.tgz"
SRC_URI[md5sum] = "f6e43c900793f19872f9bd5daedd4c66"
SRC_URI[sha256sum] = "6b1d6b6e671e7f5bb227e1247c1ed04ca99edf8ddce17ca0d8bb9931403b438c"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
