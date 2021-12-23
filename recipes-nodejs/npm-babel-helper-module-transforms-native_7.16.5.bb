SUMMARY = "NPM: @babel/helper-module-transforms"
DESCRIPTION = "Babel helper functions for implementing ES6 module transformations"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-module-transforms"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-environment-visitor-native \
           npm-babel-helper-module-imports-native \
           npm-babel-helper-simple-access-native \
           npm-babel-helper-split-export-declaration-native \
           npm-babel-helper-validator-identifier-native \
           npm-babel-template-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-transforms/-/helper-module-transforms-7.16.5.tgz"
SRC_URI[md5sum] = "0a12599c15fa9fd9de0cd83855157ca6"
SRC_URI[sha256sum] = "3239708d9e2f27a05256df71c6c489d504baff05f35e150ab40e75f264b8ac51"

NPM_PKGNAME = "@babel/helper-module-transforms"

inherit npmhelper
inherit native
