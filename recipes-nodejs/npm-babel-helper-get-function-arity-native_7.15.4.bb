SUMMARY = "NPM: @babel/helper-get-function-arity"
DESCRIPTION = "Helper function to get function arity"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-get-function-arity"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-get-function-arity/-/helper-get-function-arity-7.15.4.tgz"
SRC_URI[md5sum] = "e6ca1dc0b6b1421f94837099453e8e4c"
SRC_URI[sha256sum] = "c8d7b06b72110dcba895fe429ed489c755cd24bf8c48a64da30ee6672b307fa2"

NPM_PKGNAME = "@babel/helper-get-function-arity"

inherit npmhelper
inherit native
