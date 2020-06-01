SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-lodash-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.10.2.tgz"
SRC_URI[md5sum] = "7c8f4663f30885ea28e79cb63d8d229b"
SRC_URI[sha256sum] = "6774e5785f30c05daf1fffdfad53e23938d59b451226f1da0b0efce7de283448"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
