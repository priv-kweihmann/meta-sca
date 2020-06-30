SUMMARY = "NPM: @babel/helper-function-name"
DESCRIPTION = "Helper function to change the property 'name' of every function"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-get-function-arity-native \
           npm-babel-template-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-function-name/-/helper-function-name-7.10.4.tgz"
SRC_URI[md5sum] = "a6e67d129e9dbe1d47f330efd4679d2c"
SRC_URI[sha256sum] = "3d23893a1606b443a66f0e3db40d84dbd40c5ba25dde7d7e8da0fcacfcff6360"

NPM_PKGNAME = "@babel/helper-function-name"

inherit npmhelper
inherit native
