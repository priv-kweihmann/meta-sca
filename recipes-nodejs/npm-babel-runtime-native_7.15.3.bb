SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.15.3.tgz"
SRC_URI[md5sum] = "76b7c785d6269126362510b496588836"
SRC_URI[sha256sum] = "a0cf8dbf2ac0bae22daa0ec1018b0a3738b6e5406433ecf9989d82d1d976e2fe"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
