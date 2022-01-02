SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.16.7.tgz"
SRC_URI[md5sum] = "ca530293ebd93cd2493e6397d7605089"
SRC_URI[sha256sum] = "4ca22e3de8fb59a9ce4d3dab9a5275fad2663429d6b9269f1fe58c8e391d2f59"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
