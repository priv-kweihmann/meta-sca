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

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-transforms/-/helper-module-transforms-7.10.1.tgz"
SRC_URI[md5sum] = "6969c798b716dd26ffb854885cadc46c"
SRC_URI[sha256sum] = "b0495d65244d1ff3ea88cb02d3f686e717cc89ee09cb76f8b3eedb8a09fb2465"

NPM_PKGNAME = "@babel/helper-module-transforms"

inherit npmhelper
inherit native
