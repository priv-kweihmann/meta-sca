SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.11.0.tgz"
SRC_URI[md5sum] = "929b5c602946dbf7d9a90ff672c781bf"
SRC_URI[sha256sum] = "b6a1a57766cab67ede602416cb230ff7be19e851b7e5bfcd584a1546985cf5f8"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
