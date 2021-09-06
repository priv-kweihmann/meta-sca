SUMMARY = "NPM: @babel/helper-module-imports"
DESCRIPTION = "Babel helper functions for inserting module loads"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-module-imports"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-imports/-/helper-module-imports-7.15.4.tgz"
SRC_URI[md5sum] = "34dc1d76132441b5b5fda615bb89188c"
SRC_URI[sha256sum] = "b1c1d582c163c8de0abee9dec29ea056e0d4b4824bc83ef33ffeb43b1e8c3b47"

NPM_PKGNAME = "@babel/helper-module-imports"

inherit npmhelper
inherit native
