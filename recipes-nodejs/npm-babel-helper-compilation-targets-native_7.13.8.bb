SUMMARY = "NPM: @babel/helper-compilation-targets"
DESCRIPTION = "Engine compat data used in @babel/preset-env"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-compat-data-native \
           npm-babel-helper-validator-option-native \
           npm-browserslist-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-compilation-targets/-/helper-compilation-targets-7.13.8.tgz"
SRC_URI[md5sum] = "5ef0707ccf46c9594948fb277b0510d8"
SRC_URI[sha256sum] = "d0bda92dd18fd206d6893789c779d766e8ee932813841e01a3ba79158e1f1713"

NPM_PKGNAME = "@babel/helper-compilation-targets"

inherit npmhelper
inherit native
