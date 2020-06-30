SUMMARY = "NPM: @babel/helper-get-function-arity"
DESCRIPTION = "Helper function to get function arity"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-get-function-arity/-/helper-get-function-arity-7.10.4.tgz"
SRC_URI[md5sum] = "a8b832aa6706f86196d037370112321e"
SRC_URI[sha256sum] = "7fd6defbba8aab68fba99b3c8809b126e3af7f82206cdb9469dc0904e306c8b0"

NPM_PKGNAME = "@babel/helper-get-function-arity"

inherit npmhelper
inherit native
