SUMMARY = "NPM: @babel/helper-get-function-arity"
DESCRIPTION = "Helper function to get function arity"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-get-function-arity/-/helper-get-function-arity-7.10.3.tgz"
SRC_URI[md5sum] = "c63341121d9f692dadcee7e398962077"
SRC_URI[sha256sum] = "a7415e459c05c75e259eea200f4cb2c427af480213830fcbf13aac0cfee2ab48"

NPM_PKGNAME = "@babel/helper-get-function-arity"

inherit npmhelper
inherit native
