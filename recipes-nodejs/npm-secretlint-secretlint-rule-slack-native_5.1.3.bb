SUMMARY = "NPM: @secretlint/secretlint-rule-slack"
DESCRIPTION = "A secretlint rule for slack."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-slack/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-slack/-/secretlint-rule-slack-5.1.3.tgz"
SRC_URI[md5sum] = "71e861ec454e8f5f6b9fd25fb2828ef6"
SRC_URI[sha256sum] = "35046ae004ee489b7b049ce1f7d23a3bf548bd43a5e4b977681bb7b5116870af"

NPM_PKGNAME = "@secretlint/secretlint-rule-slack"

inherit npmhelper
inherit native
