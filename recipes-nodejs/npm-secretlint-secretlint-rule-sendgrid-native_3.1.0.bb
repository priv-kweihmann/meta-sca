SUMMARY = "NPM: @secretlint/secretlint-rule-sendgrid"
DESCRIPTION = "A secretlint rule for sendgrid api keys."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-sendgrid/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e83bae4ac4028a692e5b926c82a6d860"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-sendgrid/-/secretlint-rule-sendgrid-3.1.0.tgz"
SRC_URI[md5sum] = "47098c75af09b9aba63f3abad8e99f5d"
SRC_URI[sha256sum] = "0ebb61e6ede2e4636600302688cc6688c3dc67b7b95eab0257ffd3557310b8c6"

NPM_PKGNAME = "@secretlint/secretlint-rule-sendgrid"

inherit npmhelper
inherit native
