SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.16.0.tgz"
SRC_URI[md5sum] = "e298a90cc40996ab7d822faf78dedc5e"
SRC_URI[sha256sum] = "7fddb2fe01d42efc0cf50a4030ac51af631c0efc772f92183630f6c64433aad8"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
