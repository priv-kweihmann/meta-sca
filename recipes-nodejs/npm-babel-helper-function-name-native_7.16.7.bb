SUMMARY = "NPM: @babel/helper-function-name"
DESCRIPTION = "Helper function to change the property 'name' of every function"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-function-name"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-get-function-arity-native \
           npm-babel-template-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-function-name/-/helper-function-name-7.16.7.tgz"
SRC_URI[md5sum] = "fe6ef594ab8e9c55fa7acc2f44e800d3"
SRC_URI[sha256sum] = "da1772107abcf286f381db20854100ae0f7736d26780781ac47ba56ac54c045f"

NPM_PKGNAME = "@babel/helper-function-name"

inherit npmhelper
inherit native
