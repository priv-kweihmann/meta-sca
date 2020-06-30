SUMMARY = "NPM: @babel/helper-module-imports"
DESCRIPTION = "Babel helper functions for inserting module loads"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-imports/-/helper-module-imports-7.10.4.tgz"
SRC_URI[md5sum] = "c43af918bb2b499c7e202880d8d676c1"
SRC_URI[sha256sum] = "3622cfc5137d99abc9102ccf36222df1076f396d9b721902a7e1acc9a134f80f"

NPM_PKGNAME = "@babel/helper-module-imports"

inherit npmhelper
inherit native
