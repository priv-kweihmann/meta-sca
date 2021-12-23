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

SRC_URI = "https://registry.npmjs.org/@babel/helper-compilation-targets/-/helper-compilation-targets-7.16.3.tgz"
SRC_URI[md5sum] = "2f56f0a7aac6bef11abb9833a6cc2aff"
SRC_URI[sha256sum] = "42f5053c042487b8d38801f9e527b5339f94cbf08f8b6f2b7d638b46b6e3f645"

NPM_PKGNAME = "@babel/helper-compilation-targets"

inherit npmhelper
inherit native
