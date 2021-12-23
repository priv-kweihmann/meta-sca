SUMMARY = "NPM: @secretlint/secretlint-rule-npm"
DESCRIPTION = "A secretlint rule for npm."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-npm/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-npm/-/secretlint-rule-npm-4.1.3.tgz"
SRC_URI[md5sum] = "b1b8994eb679a1f54638c74ff9e694b9"
SRC_URI[sha256sum] = "bb97531a2ba13d9c7397e47f93bee95d6910285c21b9eeba79263bb9d45bb636"

NPM_PKGNAME = "@secretlint/secretlint-rule-npm"

inherit npmhelper
inherit native
