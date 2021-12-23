SUMMARY = "NPM: @secretlint/secretlint-rule-slack"
DESCRIPTION = "A secretlint rule for slack."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-slack/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-slack/-/secretlint-rule-slack-4.1.3.tgz"
SRC_URI[md5sum] = "a377cb877e93a5b94d8408b9ad5c31aa"
SRC_URI[sha256sum] = "b9bd24021ca2b1bcd2140f0e97518dc270920a6bd2749f10151803d35c11acce"

NPM_PKGNAME = "@secretlint/secretlint-rule-slack"

inherit npmhelper
inherit native
