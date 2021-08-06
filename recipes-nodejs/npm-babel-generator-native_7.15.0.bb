SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.15.0.tgz"
SRC_URI[md5sum] = "ff20e1b18eff4b3158d6eb4f3050725e"
SRC_URI[sha256sum] = "66e557d900f7578db9ee030f7afb1b7176603eecd0ac54f665fa4c690a805b88"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
