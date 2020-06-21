SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-lodash-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.10.3.tgz"
SRC_URI[md5sum] = "afcd30029651c93d5b75517224d288c5"
SRC_URI[sha256sum] = "232e872cf2c0c1e585107ed5e3797ff5dd8baf9185adb1c4660e7802ada88306"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
