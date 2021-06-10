SUMMARY = "NPM: @babel/helper-compilation-targets"
DESCRIPTION = "Helper functions on Babel compilation targets"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-compat-data-native \
           npm-babel-helper-validator-option-native \
           npm-browserslist-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-compilation-targets/-/helper-compilation-targets-7.14.5.tgz"
SRC_URI[md5sum] = "f726f299838115f28c74980612188d64"
SRC_URI[sha256sum] = "70edd2be47b3a3ba0b8b8df2087bd97c5b8bd9220666c5236e166c2835ecbbaa"

NPM_PKGNAME = "@babel/helper-compilation-targets"

inherit npmhelper
inherit native
