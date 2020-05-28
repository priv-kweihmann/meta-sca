SUMMARY = "NPM: @babel/helper-module-imports"
DESCRIPTION = "Babel helper functions for inserting module loads"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-imports/-/helper-module-imports-7.10.1.tgz"
SRC_URI[md5sum] = "abb6fdded3e78dc880db23be1b738810"
SRC_URI[sha256sum] = "d1013fd292c42f9850090470ceb372fb163373ebf8623d7fbe12e8c23977192e"

NPM_PKGNAME = "@babel/helper-module-imports"

inherit npmhelper
inherit native
