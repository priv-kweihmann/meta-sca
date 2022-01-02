SUMMARY = "NPM: @babel/template"
DESCRIPTION = "Generate an AST from a string template."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-template"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-code-frame-native \
           npm-babel-parser-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/template/-/template-7.16.7.tgz"
SRC_URI[md5sum] = "65b3dea316742fdb1829b34e6c766f3b"
SRC_URI[sha256sum] = "2cd40fc44dd41eb77c31f2c01af92b13eb2b264cc392423b4f5af0e01d897f84"

NPM_PKGNAME = "@babel/template"

inherit npmhelper
inherit native
