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

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-transforms/-/helper-module-transforms-7.13.0.tgz"
SRC_URI[md5sum] = "36e08afb059190437bbe8aa43640f59a"
SRC_URI[sha256sum] = "a8f5f3a32512a4e08fb83300a294d9e157f6f0e5c9bd2420d22410c997aa5669"

NPM_PKGNAME = "@babel/helper-module-transforms"

inherit npmhelper
inherit native
