SUMMARY = "NPM: @secretlint/secretlint-rule-sendgrid"
DESCRIPTION = "A secretlint rule for sendgrid api keys."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-sendgrid/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e83bae4ac4028a692e5b926c82a6d860"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-sendgrid/-/secretlint-rule-sendgrid-3.3.0.tgz"
SRC_URI[md5sum] = "fc69dfb0e37203bcdfe8003b8e5c0aa3"
SRC_URI[sha256sum] = "f724b13109abd2b3c3abc41769eb8efa292d5ebf61da0bb976cf2ec1eb1ea1da"

NPM_PKGNAME = "@secretlint/secretlint-rule-sendgrid"

inherit npmhelper
inherit native
