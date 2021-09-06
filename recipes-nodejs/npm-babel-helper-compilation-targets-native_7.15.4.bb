SUMMARY = "NPM: @babel/helper-compilation-targets"
DESCRIPTION = "Helper functions on Babel compilation targets"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-compat-data-native \
           npm-babel-helper-validator-option-native \
           npm-browserslist-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-compilation-targets/-/helper-compilation-targets-7.15.4.tgz"
SRC_URI[md5sum] = "e3043ba529a9310923b792400961d368"
SRC_URI[sha256sum] = "dd17cb3492a02d249a41814b54b158235cac74af58f23319a8a67544816cf812"

NPM_PKGNAME = "@babel/helper-compilation-targets"

inherit npmhelper
inherit native
