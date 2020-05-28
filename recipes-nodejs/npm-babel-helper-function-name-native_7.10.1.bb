SUMMARY = "NPM: @babel/helper-function-name"
DESCRIPTION = "Helper function to change the property 'name' of every function"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-get-function-arity-native \
           npm-babel-template-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-function-name/-/helper-function-name-7.10.1.tgz"
SRC_URI[md5sum] = "0a5838e55c9084c02388bd37e057b813"
SRC_URI[sha256sum] = "9f2922fe7de998cbe6156a956144c77cdf2200f65ffd107d75abba164da70798"

NPM_PKGNAME = "@babel/helper-function-name"

inherit npmhelper
inherit native
