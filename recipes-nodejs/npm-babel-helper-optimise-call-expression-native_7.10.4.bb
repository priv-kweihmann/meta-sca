SUMMARY = "NPM: @babel/helper-optimise-call-expression"
DESCRIPTION = "Helper function to optimise call expression"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-optimise-call-expression/-/helper-optimise-call-expression-7.10.4.tgz"
SRC_URI[md5sum] = "c2604351e73df92c4be7353d4fcf3cc2"
SRC_URI[sha256sum] = "01a7c5a571a625a1b7a6d59c87d7bfc95bd38cefceda4e517ff92a6a9447ec36"

NPM_PKGNAME = "@babel/helper-optimise-call-expression"

inherit npmhelper
inherit native
