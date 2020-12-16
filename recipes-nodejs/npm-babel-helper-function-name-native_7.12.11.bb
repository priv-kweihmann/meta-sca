SUMMARY = "NPM: @babel/helper-function-name"
DESCRIPTION = "Helper function to change the property 'name' of every function"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-get-function-arity-native \
           npm-babel-template-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-function-name/-/helper-function-name-7.12.11.tgz"
SRC_URI[md5sum] = "98a2cba692367cff2b8bed279aceaee8"
SRC_URI[sha256sum] = "40c49816b51aa8a3ce212a0706ad151050f3af0e27c0da3371f5f7e280a7679e"

NPM_PKGNAME = "@babel/helper-function-name"

inherit npmhelper
inherit native
