SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.17.8.tgz"
SRC_URI[md5sum] = "a53576be60b9be5c31c49e38d38a3fbb"
SRC_URI[sha256sum] = "4d74afe604d05f92b2df9f1363b4e085e10b7194d8b06b769810312f7714d21a"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
