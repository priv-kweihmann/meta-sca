SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-replace-supers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.15.4.tgz"
SRC_URI[md5sum] = "e8ff8b90ee15d8b63a73be707cdc3f8c"
SRC_URI[sha256sum] = "32909e05bd5f03881c40697c8292e9e7ac794067ba5857ba9bd4f2845a67c240"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
