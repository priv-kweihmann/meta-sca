SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.13.16.tgz"
SRC_URI[md5sum] = "f2cdf67fde410442566598575d43d1fa"
SRC_URI[sha256sum] = "e17198f644f18881bb3b4603aa2f586b35acc71f03dd41448647a8821fbf2d1c"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
