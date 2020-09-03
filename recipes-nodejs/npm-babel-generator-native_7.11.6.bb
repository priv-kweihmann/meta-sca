SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.11.6.tgz"
SRC_URI[md5sum] = "babdd68da70d92a5b5779edd2cea3d39"
SRC_URI[sha256sum] = "a240c83c827042c37fef48644693e98be6be3de7c090b33c65ff42e9db0d8ead"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
