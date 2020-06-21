SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.10.3.tgz"
SRC_URI[md5sum] = "64174c1418ce2d9366340ddfbe1ae2c5"
SRC_URI[sha256sum] = "ffa0b450f7dea19553806668bf821974c0ac4876ae8df5f602c4f0f7d649d7ff"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
