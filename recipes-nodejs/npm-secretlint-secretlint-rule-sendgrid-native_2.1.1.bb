SUMMARY = "NPM: @secretlint/secretlint-rule-sendgrid"
DESCRIPTION = "A secretlint rule for sendgrid api keys."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-sendgrid/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e83bae4ac4028a692e5b926c82a6d860"

DEPENDS = "npm-secretlint-types-native \
           npm-string.prototype.matchall-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-sendgrid/-/secretlint-rule-sendgrid-2.1.1.tgz"
SRC_URI[md5sum] = "87672c818e4977a42f910e62f6630d93"
SRC_URI[sha256sum] = "fa94911c1382a4a39762f113479a50109388fce958a3abc8c373dd8dd06eb82e"

NPM_PKGNAME = "@secretlint/secretlint-rule-sendgrid"

inherit npmhelper
inherit native
