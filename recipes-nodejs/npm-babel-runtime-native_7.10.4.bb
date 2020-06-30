SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.10.4.tgz"
SRC_URI[md5sum] = "caaac6c12965dbcbad757e0a27e513d0"
SRC_URI[sha256sum] = "e0f4b8a2719a3b3dc43619cc46a9a165622fc2fbdffabd142046d5e7a305c5d1"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
