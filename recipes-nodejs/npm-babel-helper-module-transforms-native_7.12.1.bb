SUMMARY = "NPM: @babel/helper-module-transforms"
DESCRIPTION = "Babel helper functions for implementing ES6 module transformations"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-module-imports-native \
           npm-babel-helper-replace-supers-native \
           npm-babel-helper-simple-access-native \
           npm-babel-helper-split-export-declaration-native \
           npm-babel-helper-validator-identifier-native \
           npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native \
           npm-lodash-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-transforms/-/helper-module-transforms-7.12.1.tgz"
SRC_URI[md5sum] = "b07dec5094859a8d7ab6e86767269f95"
SRC_URI[sha256sum] = "d2eca1b8320c82e1c2e6c21b08bfb507edba7759480cc775fa47459a920418d7"

NPM_PKGNAME = "@babel/helper-module-transforms"

inherit npmhelper
inherit native
