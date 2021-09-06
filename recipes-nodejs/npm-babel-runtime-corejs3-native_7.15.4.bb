SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.15.4.tgz"
SRC_URI[md5sum] = "66aa55b8403b0f93b3c60864cccc88ca"
SRC_URI[sha256sum] = "6b2892ac8f87d30350159afcf7d415dce714502a97bf4caf2d139320ed8a00a1"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
