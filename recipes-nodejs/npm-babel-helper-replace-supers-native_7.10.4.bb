SUMMARY = "NPM: @babel/helper-replace-supers"
DESCRIPTION = "Helper function to replace supers"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-helper-member-expression-to-functions-native \
           npm-babel-helper-optimise-call-expression-native \
           npm-babel-traverse-native \
           npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-replace-supers/-/helper-replace-supers-7.10.4.tgz"
SRC_URI[md5sum] = "192f205623fa2499826b284add50f6f2"
SRC_URI[sha256sum] = "f15a1e3d26de7eff1f0d5d973ee6f6ab9762f0f39becfa88733b4a09307ef0f2"

NPM_PKGNAME = "@babel/helper-replace-supers"

inherit npmhelper
inherit native
