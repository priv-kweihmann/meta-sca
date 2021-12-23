SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.16.5.tgz"
SRC_URI[md5sum] = "1a0212e91cabacba5534bece40f1e9f4"
SRC_URI[sha256sum] = "b9e6de73eea4790ec83ca0021aafdd87a2c81cc86ad669e5a77c9894131e31e6"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
