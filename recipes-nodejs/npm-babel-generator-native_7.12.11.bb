SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.12.11.tgz"
SRC_URI[md5sum] = "2ee0a491048488204f3d1667ae58dfe7"
SRC_URI[sha256sum] = "0bff90b8edb45d5f6705d7a6f3173aae5a9b0fe2eb27d002834613c49ce630db"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
