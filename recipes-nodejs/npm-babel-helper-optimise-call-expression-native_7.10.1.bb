SUMMARY = "NPM: @babel/helper-optimise-call-expression"
DESCRIPTION = "Helper function to optimise call expression"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-optimise-call-expression/-/helper-optimise-call-expression-7.10.1.tgz"
SRC_URI[md5sum] = "690577d95c25aed5683a8c28a3965eb6"
SRC_URI[sha256sum] = "3e9912d33c089c59cd2ca01643514d438492f494f46f300fa1b619033a4881ef"

NPM_PKGNAME = "@babel/helper-optimise-call-expression"

inherit npmhelper
inherit native
