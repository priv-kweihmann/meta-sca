SUMMARY = "NPM: @secretlint/secretlint-rule-github"
DESCRIPTION = "A secretlint rule for sendgrid api keys."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-github/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e83bae4ac4028a692e5b926c82a6d860"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-github/-/secretlint-rule-github-5.0.1.tgz"
SRC_URI[md5sum] = "10caadbf3a298566ab8a8b72d468c62f"
SRC_URI[sha256sum] = "6516208611b5c25be30d22f167d888af4697cf767fadc32098ff2ac86b1acab9"

NPM_PKGNAME = "@secretlint/secretlint-rule-github"

inherit npmhelper
inherit native
