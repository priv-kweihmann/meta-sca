SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.16.0.tgz"
SRC_URI[md5sum] = "deb922bf64fdf5239e5e3efc44e9d161"
SRC_URI[sha256sum] = "6a701c4959cef040f5a53396ba6515f3b4d30964a2f64fcf83bda9620532d82f"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
