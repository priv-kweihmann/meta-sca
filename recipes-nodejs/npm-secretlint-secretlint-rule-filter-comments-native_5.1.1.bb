SUMMARY = "NPM: @secretlint/secretlint-rule-filter-comments"
DESCRIPTION = "secretlint-disable comment directive."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-filter-comments/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa9e77067014c95af709fcb652c2ca"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-filter-comments/-/secretlint-rule-filter-comments-5.1.1.tgz"
SRC_URI[md5sum] = "3fa4ffe4b1300821c6136c88c79ef359"
SRC_URI[sha256sum] = "fbfe02985b8860e572760aa6287758b17ab5a5fb757e4d17dbe76a36164c43a5"

NPM_PKGNAME = "@secretlint/secretlint-rule-filter-comments"

inherit npmhelper
inherit native
