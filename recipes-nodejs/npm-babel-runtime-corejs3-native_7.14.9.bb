SUMMARY = "NPM: @babel/runtime-corejs3"
DESCRIPTION = "babel's modular runtime helpers with core-js@3 polyfilling"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-core-js-pure-native \
           npm-regenerator-runtime-native"

SRC_URI = "https://registry.npmjs.org/@babel/runtime-corejs3/-/runtime-corejs3-7.14.9.tgz"
SRC_URI[md5sum] = "de0ebe2668f3913557d1f9632455096f"
SRC_URI[sha256sum] = "a098a3dd968a68b19c727991154d93da7877fd42105f6c61dbd059591bc844c3"

NPM_PKGNAME = "@babel/runtime-corejs3"

inherit npmhelper
inherit native
