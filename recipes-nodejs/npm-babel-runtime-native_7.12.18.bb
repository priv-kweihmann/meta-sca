SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.12.18.tgz"
SRC_URI[md5sum] = "e682d508bd26a4dbde235afb874a513e"
SRC_URI[sha256sum] = "f2896c9be48b2eff7add0b8fb9d63ea42fdbeeedd5c245964328295937269a5d"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
