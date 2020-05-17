SUMMARY = "NPM: @babel/helper-module-imports"
DESCRIPTION = "Babel helper functions for inserting module loads"
HOMEPAGE = "https://babeljs.io/"

DEPENDS = "npm-babel-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-imports/-/helper-module-imports-7.8.3.tgz"
SRC_URI[md5sum] = "b2dfecc7f5d82757435ab20a3900d997"
SRC_URI[sha256sum] = "50249982f233b37c74d26a736d887f3e3f3a114c735ac243ab3987197b1c4222"

NPM_PKGNAME = "@babel/helper-module-imports"

inherit npmhelper
inherit native
