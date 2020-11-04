SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.12.5.tgz"
SRC_URI[md5sum] = "800e2f4204d80a8a668b756de19ee3c8"
SRC_URI[sha256sum] = "149dc76073274ac42d0f5ef8a2246ef6bb5c5348deb532703e1486e9ba231a2c"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
