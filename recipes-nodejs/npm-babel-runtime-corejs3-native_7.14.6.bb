SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.14.6.tgz"
SRC_URI[md5sum] = "b7d9301c1e1b252a730ad938fe2c4cf6"
SRC_URI[sha256sum] = "b85ff18b8ccb81e739d0443cdbda09012bea8e737932a412c54b6ca90892ce29"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
