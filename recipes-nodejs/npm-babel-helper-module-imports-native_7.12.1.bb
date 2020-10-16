SUMMARY = "NPM: @babel/helper-module-imports"
DESCRIPTION = "Babel helper functions for inserting module loads"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-imports/-/helper-module-imports-7.12.1.tgz"
SRC_URI[md5sum] = "43300f84b1f43ea3e00c88ea76b3de46"
SRC_URI[sha256sum] = "7b9452ef72b1070e59b09a2f6ddd8e2800ce2b98588d6dbb7ca4a7964c205495"

NPM_PKGNAME = "@babel/helper-module-imports"

inherit npmhelper
inherit native
