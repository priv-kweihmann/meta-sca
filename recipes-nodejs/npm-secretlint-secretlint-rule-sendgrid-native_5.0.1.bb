SUMMARY = "NPM: @secretlint/secretlint-rule-sendgrid"
DESCRIPTION = "A secretlint rule for sendgrid api keys."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-sendgrid/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e83bae4ac4028a692e5b926c82a6d860"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-sendgrid/-/secretlint-rule-sendgrid-5.0.1.tgz"
SRC_URI[md5sum] = "82e5aacacf022e9065032d62c8ac0dd6"
SRC_URI[sha256sum] = "edeb2d2783ca218410d78901e577b0a9dd406e90a29c97e634887e5dfe538ed1"

NPM_PKGNAME = "@secretlint/secretlint-rule-sendgrid"

inherit npmhelper
inherit native
