SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.12.1.tgz"
SRC_URI[md5sum] = "bb091f2db09d07b716b372dd9688d671"
SRC_URI[sha256sum] = "bca46cbe1a99d25f4684bdc185e030d81da0f4c9766ec41c89f43ea3e3e4d260"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
