SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-replace-supers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.12.13.tgz"
SRC_URI[md5sum] = "1b61afebfcef69d7e33415f68fce3913"
SRC_URI[sha256sum] = "774bb7c311010fc27d82dd8546b22e3fa7c5af922928ca86a9377807e57dda54"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
