SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.17.9.tgz"
SRC_URI[md5sum] = "d67070df1049fa27d947da69521dadd4"
SRC_URI[sha256sum] = "ff7cfac68698985f91b704387077db5dd8e4514d619bcdd83bac8ec5e07a9fbd"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
