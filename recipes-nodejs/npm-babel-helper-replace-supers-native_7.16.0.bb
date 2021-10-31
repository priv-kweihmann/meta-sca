SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-replace-supers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.16.0.tgz"
SRC_URI[md5sum] = "c0f7a030e43e156cc330a2d9c0396e4d"
SRC_URI[sha256sum] = "477a5a8a58ee28b3ffa958e5996a3ae4641081a45fcb2fa209df8543dacea735"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
