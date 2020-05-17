SUMMARY = "NPM: @babel/helper-optimise-call-expression"
DESCRIPTION = "Helper function to optimise call expression"
DEPENDS = "npm-babel-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/helper-optimise-call-expression/-/helper-optimise-call-expression-7.8.3.tgz"
SRC_URI[md5sum] = "65e68698b26e46aa036cac27cbe69293"
SRC_URI[sha256sum] = "31b543c2f91b18701bc7387d9d387947be74e695a1ace8935d077ac8050c5f84"

NPM_PKGNAME = "@babel/helper-optimise-call-expression"

inherit npmhelper
inherit native
