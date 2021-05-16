SUMMARY = "NPM: @babel/helper-function-name"
DESCRIPTION = "Helper function to change the property 'name' of every function"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-function-name"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-get-function-arity-native \
           npm-babel-template-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-function-name/-/helper-function-name-7.14.2.tgz"
SRC_URI[md5sum] = "b3d7666d07191ebcce15230dbae6d72d"
SRC_URI[sha256sum] = "ff630d9ee0eb5b8fb3f2f5aacd69f4d1b4d898bf3ce8870ca54cf71a4ef7dfe2"

NPM_PKGNAME = "@babel/helper-function-name"

inherit npmhelper
inherit native
