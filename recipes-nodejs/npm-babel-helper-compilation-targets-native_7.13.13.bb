SUMMARY = "NPM: @babel/helper-compilation-targets"
DESCRIPTION = "Engine compat data used in @babel/preset-env"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-compat-data-native \
           npm-babel-helper-validator-option-native \
           npm-browserslist-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-compilation-targets/-/helper-compilation-targets-7.13.13.tgz"
SRC_URI[md5sum] = "c1d3a8632119fbe0078c56061a58bb4d"
SRC_URI[sha256sum] = "a9189a218179a891da94ff111af935d3f21a9fddff63c3a1e9a90b9021a7bff0"

NPM_PKGNAME = "@babel/helper-compilation-targets"

inherit npmhelper
inherit native
