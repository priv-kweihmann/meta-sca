SUMMARY = "NPM: @babel/helpers"
DESCRIPTION = "Collection of helper functions used by Babel transforms."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helpers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helpers/-/helpers-7.14.0.tgz"
SRC_URI[md5sum] = "36a10fb630fcf39613e15ce1919405a3"
SRC_URI[sha256sum] = "21deeeb69be08d9c28c2b11a7cec82ce794c7357d601497f82c9196515795d33"

NPM_PKGNAME = "@babel/helpers"

inherit npmhelper
inherit native
