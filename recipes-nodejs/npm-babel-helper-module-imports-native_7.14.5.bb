SUMMARY = "NPM: @babel/helper-module-imports"
DESCRIPTION = "Babel helper functions for inserting module loads"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-module-imports"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-imports/-/helper-module-imports-7.14.5.tgz"
SRC_URI[md5sum] = "d6e9b56ecbbd6982860455d9031b915d"
SRC_URI[sha256sum] = "d1bfb101936ab0e0544345dd991e517f8330ff713a90c53819474d62c7ae7276"

NPM_PKGNAME = "@babel/helper-module-imports"

inherit npmhelper
inherit native
