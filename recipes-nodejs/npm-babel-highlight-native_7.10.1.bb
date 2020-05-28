SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-chalk-native \
           npm-js-tokens-native"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.10.1.tgz"
SRC_URI[md5sum] = "a45ba2df247e5522c91d3be23c590a6c"
SRC_URI[sha256sum] = "c2e10e57316ab8e3f494d6dfddb27eea7534b03d8ce5089f83b8b13d4e6096df"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
