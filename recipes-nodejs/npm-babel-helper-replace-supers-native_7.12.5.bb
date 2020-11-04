SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.12.5.tgz"
SRC_URI[md5sum] = "6a2d7600485c5403cd6d5f93c3d47a05"
SRC_URI[sha256sum] = "3ebefb149e25dd8f95ea1b1293c2852a6cbe6111424adf07b3e4ce577022dffb"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
