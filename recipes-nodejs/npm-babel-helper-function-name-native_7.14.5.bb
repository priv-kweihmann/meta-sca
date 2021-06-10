SUMMARY = "NPM: @babel/helper-function-name"
DESCRIPTION = "Helper function to change the property 'name' of every function"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-function-name"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-get-function-arity-native \
           npm-babel-template-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-function-name/-/helper-function-name-7.14.5.tgz"
SRC_URI[md5sum] = "992df12aee15ccaca080bf7fb153b57c"
SRC_URI[sha256sum] = "daa8179f46b367953191d7141bbe2727b72b47f10024b3b50291d2a3e09fe557"

NPM_PKGNAME = "@babel/helper-function-name"

inherit npmhelper
inherit native
