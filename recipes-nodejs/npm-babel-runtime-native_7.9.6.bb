SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babeljs.io/docs/en/next/babel-runtime"

DEPENDS = "npm-regenerator-runtime-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.9.6.tgz"
SRC_URI[md5sum] = "f3a02bba623d4a256b522a09a14e71c4"
SRC_URI[sha256sum] = "fac415ba2095ea3f7a36a1edd5aac74af41c87a162a0288a630f632c43f35958"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
