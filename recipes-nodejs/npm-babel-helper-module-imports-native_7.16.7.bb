SUMMARY = "NPM: @babel/helper-module-imports"
DESCRIPTION = "Babel helper functions for inserting module loads"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-module-imports"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-imports/-/helper-module-imports-7.16.7.tgz"
SRC_URI[md5sum] = "33db5ddd8ebf2f13cbc13d94a7c3bc32"
SRC_URI[sha256sum] = "fecd1c2cf4756ea17953c004ef9a257bd666484ca80cc94961aa1a0e9ad35e57"

NPM_PKGNAME = "@babel/helper-module-imports"

inherit npmhelper
inherit native
