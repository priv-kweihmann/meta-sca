SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

DEPENDS = "npm-babel-types-native npm-jsesc-native npm-lodash-native npm-source-map-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.9.6.tgz"
SRC_URI[md5sum] = "cc6cf9180e2235c801f30c63cc945a32"
SRC_URI[sha256sum] = "b1d2cc0d445b8ff9deee1e3150612f53ca509a73e0c51c97c9efc2a10100998d"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
