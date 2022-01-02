SUMMARY = "NPM: @babel/helper-compilation-targets"
DESCRIPTION = "Helper functions on Babel compilation targets"
HOMEPAGE = "{homepage}"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-compat-data-native \
           npm-babel-helper-validator-option-native \
           npm-browserslist-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-compilation-targets/-/helper-compilation-targets-7.16.7.tgz"
SRC_URI[md5sum] = "09aff53f0695c886d7daaec61e3f6c4e"
SRC_URI[sha256sum] = "77584007eb5b73f41a28175bb720dd5f24058151406a6dcf56506db77f69f649"

NPM_PKGNAME = "@babel/helper-compilation-targets"

inherit npmhelper
inherit native
