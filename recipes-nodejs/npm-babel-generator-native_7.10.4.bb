SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-lodash-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.10.4.tgz"
SRC_URI[md5sum] = "1b46fd4b993e3026c43ee667e2c84341"
SRC_URI[sha256sum] = "8a610acf66b13774d6f4fba9581ef438bcb69fd9af691f210278c8485209874a"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
