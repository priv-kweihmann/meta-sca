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

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-transforms/-/helper-module-transforms-7.10.4.tgz"
SRC_URI[md5sum] = "ac164f63655f71ab981eb96a19fac318"
SRC_URI[sha256sum] = "3bd2527b44db270a9812a58298024d3de1abcc0e9c794efb9071ed7193a298ab"

NPM_PKGNAME = "@babel/helper-module-transforms"

inherit npmhelper
inherit native
