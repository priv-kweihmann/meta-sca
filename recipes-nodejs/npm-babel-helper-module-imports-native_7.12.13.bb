SUMMARY = "NPM: @babel/helper-module-imports"
DESCRIPTION = "Babel helper functions for inserting module loads"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-module-imports"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-imports/-/helper-module-imports-7.12.13.tgz"
SRC_URI[md5sum] = "e2c6246894aa90be1363b5a444fe4f2a"
SRC_URI[sha256sum] = "68b836938f51fac48c1bd8d6d70ed65e76ee52d31798b57ef728d1530c8746c8"

NPM_PKGNAME = "@babel/helper-module-imports"

inherit npmhelper
inherit native
