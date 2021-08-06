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
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-transforms/-/helper-module-transforms-7.15.0.tgz"
SRC_URI[md5sum] = "898ccaf2ec5e4cc6f33474498069ed52"
SRC_URI[sha256sum] = "e1d7ef3c6f3ab01f02a63697dfd5b866e44f8e94d767bc7dbb7b0073ec7a7bb6"

NPM_PKGNAME = "@babel/helper-module-transforms"

inherit npmhelper
inherit native
