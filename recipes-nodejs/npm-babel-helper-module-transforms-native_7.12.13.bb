SUMMARY = "NPM: @babel/helper-module-transforms"
DESCRIPTION = "Babel helper functions for implementing ES6 module transformations"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-module-transforms"

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

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-transforms/-/helper-module-transforms-7.12.13.tgz"
SRC_URI[md5sum] = "35ed5d6f6c5aca458691c5729eb86c20"
SRC_URI[sha256sum] = "224d45efb03f780a2b7fb9cf0b300c2e12e1901cc61dfe8dfc1943aa3b3b2542"

NPM_PKGNAME = "@babel/helper-module-transforms"

inherit npmhelper
inherit native
