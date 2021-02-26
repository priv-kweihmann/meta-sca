SUMMARY = "NPM: @babel/helper-compilation-targets"
DESCRIPTION = "Engine compat data used in @babel/preset-env"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-compat-data-native \
           npm-babel-helper-validator-option-native \
           npm-browserslist-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-compilation-targets/-/helper-compilation-targets-7.13.0.tgz"
SRC_URI[md5sum] = "d54206a16deec2a0ac037a8e22b1b5de"
SRC_URI[sha256sum] = "bb0fb3318f8dd0728bf53e974b4cbfa8a3a9445693c9e564dcde93bde0dc4604"

NPM_PKGNAME = "@babel/helper-compilation-targets"

inherit npmhelper
inherit native
