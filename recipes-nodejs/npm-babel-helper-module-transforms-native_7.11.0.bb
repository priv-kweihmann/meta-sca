SUMMARY = "NPM: @babel/helper-module-transforms"
DESCRIPTION = "Babel helper functions for implementing ES6 module transformations"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-module-imports-native \
           npm-babel-helper-replace-supers-native \
           npm-babel-helper-simple-access-native \
           npm-babel-helper-split-export-declaration-native \
           npm-babel-template-native \
           npm-babel-types-native \
           npm-lodash-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-transforms/-/helper-module-transforms-7.11.0.tgz"
SRC_URI[md5sum] = "7d176835e7b6d7b9086c5cd2316b6fc8"
SRC_URI[sha256sum] = "f37919be9db307690bb9c48510458b6a02b2168fc517df1260a0290c9c132832"

NPM_PKGNAME = "@babel/helper-module-transforms"

inherit npmhelper
inherit native
