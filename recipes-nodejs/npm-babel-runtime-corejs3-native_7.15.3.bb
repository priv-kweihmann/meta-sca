SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.15.3.tgz"
SRC_URI[md5sum] = "950b90d484e569ae6375701d6235504b"
SRC_URI[sha256sum] = "cfdc98267b8d884fc7b190779491eda6f302f6591fb5a086c04ff50940ef0f91"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
