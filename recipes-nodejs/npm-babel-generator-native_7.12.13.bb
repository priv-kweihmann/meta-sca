SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.12.13.tgz"
SRC_URI[md5sum] = "ead7211373302455e746932a7b315f15"
SRC_URI[sha256sum] = "6d34b481a8cba63aa7ee5f52cfe546b06c1686355c258995d70b4917c8c79d91"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
