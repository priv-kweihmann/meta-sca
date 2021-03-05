SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.13.9.tgz"
SRC_URI[md5sum] = "8c12d63d74b679604578e7d083ad52ef"
SRC_URI[sha256sum] = "d043c4aee119c43813c6b17b00d6ec9983f8d8a8b9d955d1c2c9b129fbdd5b1a"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
