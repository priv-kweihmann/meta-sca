SUMMARY = "NPM: @secretlint/secretlint-rule-github"
DESCRIPTION = "A secretlint rule for sendgrid api keys."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-github/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e83bae4ac4028a692e5b926c82a6d860"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-github/-/secretlint-rule-github-5.2.0.tgz"
SRC_URI[md5sum] = "26b6076fda0b80c6a621ab6ab7982d27"
SRC_URI[sha256sum] = "06a005d6f32bdf885896958a66a7dd16e2f66196cdd5d98e5191fef1e51db1ff"

NPM_PKGNAME = "@secretlint/secretlint-rule-github"

inherit npmhelper
inherit native
