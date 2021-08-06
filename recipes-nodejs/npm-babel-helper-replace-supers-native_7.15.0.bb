SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-replace-supers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.15.0.tgz"
SRC_URI[md5sum] = "9dd64f432490be78a68189cc39e03f5f"
SRC_URI[sha256sum] = "16321e24902d19cfb910a8f02d3fccb850ec3faaa955ae6a2756408fbe28b0a4"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
