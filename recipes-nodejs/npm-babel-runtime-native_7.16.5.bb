SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.16.5.tgz"
SRC_URI[md5sum] = "0421c33d61ac59e203bc3f86eb6c1f65"
SRC_URI[sha256sum] = "5b140532a692ebe3749240f122e90d50c26c5f8b510c7db6cfdd37eb7964f9cf"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
