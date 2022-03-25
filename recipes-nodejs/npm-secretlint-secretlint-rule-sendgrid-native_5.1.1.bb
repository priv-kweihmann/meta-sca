SUMMARY = "NPM: @secretlint/secretlint-rule-sendgrid"
DESCRIPTION = "A secretlint rule for sendgrid api keys."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-sendgrid/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e83bae4ac4028a692e5b926c82a6d860"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-sendgrid/-/secretlint-rule-sendgrid-5.1.1.tgz"
SRC_URI[md5sum] = "5a235f5095d22f2534168f6ca0e1e55a"
SRC_URI[sha256sum] = "6d5709a09123cc20b2ce8e636d98213e3bebb82c1e5955b1823625cbeb9e066b"

NPM_PKGNAME = "@secretlint/secretlint-rule-sendgrid"

inherit npmhelper
inherit native
