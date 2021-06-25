SUMMARY = "NPM: @babel/helper-member-expression-to-functions"
DESCRIPTION = "Helper function to replace certain member expressions with function calls"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-member-expression-to-functions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-member-expression-to-functions/-/helper-member-expression-to-functions-7.14.7.tgz"
SRC_URI[md5sum] = "686f2362f3285cd8888aad8f069b7386"
SRC_URI[sha256sum] = "860193a022a6003566c39cf09a4289a0336302c05319928c2fdd5d8f14fa15a1"

NPM_PKGNAME = "@babel/helper-member-expression-to-functions"

inherit npmhelper
inherit native
