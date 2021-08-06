SUMMARY = "NPM: @babel/helper-compilation-targets"
DESCRIPTION = "Helper functions on Babel compilation targets"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-compat-data-native \
           npm-babel-helper-validator-option-native \
           npm-browserslist-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-compilation-targets/-/helper-compilation-targets-7.15.0.tgz"
SRC_URI[md5sum] = "86e1be173c428a0673b3d03c4b1f32c0"
SRC_URI[sha256sum] = "55e4b73623064089cdf28753a8e7b97d147ca960e9b5f7e557eccae3dbc1f521"

NPM_PKGNAME = "@babel/helper-compilation-targets"

inherit npmhelper
inherit native
