SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babeljs.io/"

DEPENDS = "npm-babel-helper-validator-identifier-native npm-chalk-native npm-js-tokens-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.9.0.tgz"
SRC_URI[md5sum] = "abbdd9470ccc2c2a4ed26629e7bd77e0"
SRC_URI[sha256sum] = "13958b6ccb7084858dda0b46bfc926f0718fa0958e7c6b38c6c3acf1a72c6f4c"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
