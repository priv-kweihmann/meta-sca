SUMMARY = "NPM: @babel/highlight"
DESCRIPTION = "Syntax highlight JavaScript strings for output in terminals."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-highlight"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-chalk-native \
           npm-js-tokens-native"

SRC_URI = "https://registry.npmjs.org/@babel/highlight/-/highlight-7.17.9.tgz"
SRC_URI[md5sum] = "4e90492ed0d6aadf0253e56ba444c67b"
SRC_URI[sha256sum] = "7431a2d4d2d39e8f69f7ef23c7485d8e59dd8058274bfd394b4d1bd8c2f61a9b"

NPM_PKGNAME = "@babel/highlight"

inherit npmhelper
inherit native
