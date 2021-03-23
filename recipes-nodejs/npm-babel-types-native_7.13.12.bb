SUMMARY = "NPM: @babel/types"
DESCRIPTION = "Babel Types is a Lodash-esque utility library for AST nodes"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-types"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-validator-identifier-native \
           npm-lodash-native \
           npm-to-fast-properties-native"

SRC_URI = "https://registry.npmjs.org/@babel/types/-/types-7.13.12.tgz"
SRC_URI[md5sum] = "5e973117a291f72f1fab8d43feff991c"
SRC_URI[sha256sum] = "38269f1a736db83b0c70f81049074d57b9db36db8decb98d36a0d8e91512abd5"

NPM_PKGNAME = "@babel/types"

inherit npmhelper
inherit native
