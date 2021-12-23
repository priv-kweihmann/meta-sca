SUMMARY = "NPM: strip-indent"
DESCRIPTION = "Strip leading whitespace from each line in a string"
HOMEPAGE = "https://github.com/sindresorhus/strip-indent#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-min-indent-native"

SRC_URI = "https://registry.npmjs.org/strip-indent/-/strip-indent-4.0.0.tgz"
SRC_URI[md5sum] = "afb2e35009ec94813e37239f02333ed0"
SRC_URI[sha256sum] = "f4068435be311b6dc652a9944744435b4e7dfa0462be041d67f67f75b5a9d0b5"

NPM_PKGNAME = "strip-indent"

inherit npmhelper
inherit native
