SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-lodash-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.10.1.tgz"
SRC_URI[md5sum] = "c86dbb898dbdd01bc4acd3f0111cb55c"
SRC_URI[sha256sum] = "ee8ee680aa868cfbe27c09a2cdfbe606a3762ad58b0f00fc2574bc83c3ca14b5"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
