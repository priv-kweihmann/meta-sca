SUMMARY = "NPM: @babel/runtime"
DESCRIPTION = "babel's modular runtime helpers"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime/-/runtime-7.12.1.tgz"
SRC_URI[md5sum] = "686004b34376b94b3e14c4ce770cf5fc"
SRC_URI[sha256sum] = "28acafd916220c744791c5e84777234c6c11c099f6567e653b5e8fd080e29748"

NPM_PKGNAME = "@babel/runtime"

inherit npmhelper
inherit native
