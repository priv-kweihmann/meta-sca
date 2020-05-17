SUMMARY = "NPM: @babel/helper-get-function-arity"
DESCRIPTION = "Helper function to get function arity"
DEPENDS = "npm-babel-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/helper-get-function-arity/-/helper-get-function-arity-7.8.3.tgz"
SRC_URI[md5sum] = "4909efcab6cd7d206da68609bd3ddc2b"
SRC_URI[sha256sum] = "28b58017299de2e0dbbe6ff2812e86fa7d722a72d18520c4fef8fc1c3d1b5bda"

NPM_PKGNAME = "@babel/helper-get-function-arity"

inherit npmhelper
inherit native
