SUMMARY = "NPM: @babel/helper-function-name"
DESCRIPTION = "Helper function to change the property 'name' of every function"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-function-name"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-get-function-arity-native \
           npm-babel-template-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-function-name/-/helper-function-name-7.12.13.tgz"
SRC_URI[md5sum] = "e71e30bb9170aca538674078c5cf4188"
SRC_URI[sha256sum] = "f8fe08fb616ea9442dbf6ef6fff18970188705d2f41a2e120e8c6472c49608cb"

NPM_PKGNAME = "@babel/helper-function-name"

inherit npmhelper
inherit native
