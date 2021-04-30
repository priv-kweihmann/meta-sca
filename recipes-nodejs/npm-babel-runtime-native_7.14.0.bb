SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.14.0.tgz"
SRC_URI[md5sum] = "b5ec5c54b8be621d2490cf4e2ad52c32"
SRC_URI[sha256sum] = "8e876beb42299aa2414c3f4cba54cfcbf89dc3a35243aeaffacf1bba216893c1"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
