SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-runtime"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.13.17.tgz"
SRC_URI[md5sum] = "5c74dce15f0a3d36cbf774a5adc901a7"
SRC_URI[sha256sum] = "89c49c010bd7fc65f22233aadb7e1dee2da2838b48c0b76efc94296375f36359"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
