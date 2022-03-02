SUMMARY = "NPM: @secretlint/secretlint-rule-aws"
DESCRIPTION = "A secretlint rule for AWS."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-aws/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-regx-native \
           npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-aws/-/secretlint-rule-aws-4.2.0.tgz"
SRC_URI[md5sum] = "d80836bfc007ea79e2d1a7836ce2c012"
SRC_URI[sha256sum] = "16e0f369eb77f519bedae3fc7f39c2b6796e7e7bab2bb185140c455563737ab0"

NPM_PKGNAME = "@secretlint/secretlint-rule-aws"

inherit npmhelper
inherit native
