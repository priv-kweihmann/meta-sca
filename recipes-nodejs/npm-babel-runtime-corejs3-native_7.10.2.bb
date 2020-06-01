SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.10.2.tgz"
SRC_URI[md5sum] = "602dba229f539698bdd3af96e96658a6"
SRC_URI[sha256sum] = "ef76d79ec164fe7beac4f9768fb59ddd362296b6595ba576583ec65f3b76048a"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
