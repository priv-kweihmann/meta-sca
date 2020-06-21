SUMMARY = "NPM: @babel/helper-function-name"
DESCRIPTION = "Helper function to change the property 'name' of every function"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-get-function-arity-native \
           npm-babel-template-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-function-name/-/helper-function-name-7.10.3.tgz"
SRC_URI[md5sum] = "a86cadfa5e152faf44c59f216f47cce1"
SRC_URI[sha256sum] = "41669e5f6bedf4828bb5485dfe1d765eb59d903a7d0fff34ccda14b4e6b17f11"

NPM_PKGNAME = "@babel/helper-function-name"

inherit npmhelper
inherit native
