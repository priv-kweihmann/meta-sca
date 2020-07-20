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

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-transforms/-/helper-module-transforms-7.10.5.tgz"
SRC_URI[md5sum] = "0706d9641949c83a96d012417485d698"
SRC_URI[sha256sum] = "34952a834a56c7fe416358d1aba6d981b7f5b1695af213086953bf8249479cad"

NPM_PKGNAME = "@babel/helper-module-transforms"

inherit npmhelper
inherit native
