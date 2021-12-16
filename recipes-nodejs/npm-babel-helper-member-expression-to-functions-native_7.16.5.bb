SUMMARY = "NPM: @babel/helper-member-expression-to-functions"
DESCRIPTION = "Helper function to replace certain member expressions with function calls"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-member-expression-to-functions"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-member-expression-to-functions/-/helper-member-expression-to-functions-7.16.5.tgz"
SRC_URI[md5sum] = "681ee64691431e974ae192a354ca2cbe"
SRC_URI[sha256sum] = "0974caf24eba149129ba0ebdb3327d519dd9e23102d5943c4e25892de9ebdb70"

NPM_PKGNAME = "@babel/helper-member-expression-to-functions"

inherit npmhelper
inherit native
