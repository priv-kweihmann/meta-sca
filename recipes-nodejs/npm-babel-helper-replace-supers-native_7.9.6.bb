SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
DEPENDS = "npm-babel-helper-member-expression-to-functions-native npm-babel-helper-optimise-call-expression-native npm-babel-traverse-native npm-babel-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.9.6.tgz"
SRC_URI[md5sum] = "a54bb37830eac567cd90c4387a1cc1cd"
SRC_URI[sha256sum] = "030423f227883b02e11d55563bcd9d213cba7afa54e9cf12aa6898ba958fa739"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
