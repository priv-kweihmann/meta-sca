SUMMARY = "NPM: @secretlint/secretlint-rule-filter-comments"
DESCRIPTION = "secretlint-disable comment directive."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-filter-comments/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-filter-comments/-/secretlint-rule-filter-comments-5.1.3.tgz"
SRC_URI[md5sum] = "eb3a672b7f4435c2f2e45ccbc1d3a3e2"
SRC_URI[sha256sum] = "f0e51a3756e393bb14ce7f74772b9e0d90b2cd0f9c1f8a9297a5343749843dcc"

NPM_PKGNAME = "@secretlint/secretlint-rule-filter-comments"

inherit npmhelper
inherit native
