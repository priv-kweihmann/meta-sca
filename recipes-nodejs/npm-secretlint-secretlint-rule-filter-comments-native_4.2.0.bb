SUMMARY = "NPM: @secretlint/secretlint-rule-filter-comments"
DESCRIPTION = "secretlint-disable comment directive."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-filter-comments/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-lint-staged-native \
           npm-prettier-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-filter-comments/-/secretlint-rule-filter-comments-4.2.0.tgz"
SRC_URI[md5sum] = "10e7bf520a321299583de404cef3937d"
SRC_URI[sha256sum] = "068508d6be19e6df59f039ede74763f1be09460f91a7410e25d66943d6df4f64"

NPM_PKGNAME = "@secretlint/secretlint-rule-filter-comments"

inherit npmhelper
inherit native
