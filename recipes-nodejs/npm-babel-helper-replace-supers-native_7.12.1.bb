SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.12.1.tgz"
SRC_URI[md5sum] = "110a173e9e75e58fc675099c4a5e6afb"
SRC_URI[sha256sum] = "07cf98f171384543534f7cf5c5fc5fa7de9ae03fc77cff7ff8270795c45f1e3e"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
