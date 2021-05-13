SUMMARY = "NPM: @secretlint/secretlint-rule-privatekey"
DESCRIPTION = "A secretlint rule for PrivateKey."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-privatekey/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-string.prototype.matchall-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-privatekey/-/secretlint-rule-privatekey-2.1.1.tgz"
SRC_URI[md5sum] = "133d8b89595bb00152542b70c1522a57"
SRC_URI[sha256sum] = "fcd0e51923a8d5741acee5d095b089456faa507887ff2b28a0a1dedac93721cb"

NPM_PKGNAME = "@secretlint/secretlint-rule-privatekey"

inherit npmhelper
inherit native
