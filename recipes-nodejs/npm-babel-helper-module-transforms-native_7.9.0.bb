SUMMARY = "NPM: @babel/helper-module-transforms"
DESCRIPTION = "Babel helper functions for implementing ES6 module transformations"
HOMEPAGE = "https://babeljs.io/"

DEPENDS = "npm-babel-helper-module-imports-native npm-babel-helper-replace-supers-native npm-babel-helper-simple-access-native npm-babel-helper-split-export-declaration-native npm-babel-template-native npm-babel-types-native npm-lodash-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-transforms/-/helper-module-transforms-7.9.0.tgz"
SRC_URI[md5sum] = "b1ec0528ce53359dd6a58a03a9e7fd27"
SRC_URI[sha256sum] = "d8792663026f9d3f9384c6272c2aff640a38f889bb704949af23b0909b8dbc85"

NPM_PKGNAME = "@babel/helper-module-transforms"

inherit npmhelper
inherit native
