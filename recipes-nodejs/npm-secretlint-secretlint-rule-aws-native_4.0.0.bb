SUMMARY = "NPM: @secretlint/secretlint-rule-aws"
DESCRIPTION = "A secretlint rule for AWS."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-aws/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-regx-native \
           npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-aws/-/secretlint-rule-aws-4.0.0.tgz"
SRC_URI[md5sum] = "60de94c219947e78366fbf8ed79c6d60"
SRC_URI[sha256sum] = "46238a0f2f934e37597723e10e4064426436f11c706a035c918f6682e6401df9"

NPM_PKGNAME = "@secretlint/secretlint-rule-aws"

inherit npmhelper
inherit native
