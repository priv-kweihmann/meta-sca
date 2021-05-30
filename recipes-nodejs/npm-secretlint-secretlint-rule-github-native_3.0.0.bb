SUMMARY = "NPM: @secretlint/secretlint-rule-github"
DESCRIPTION = "A secretlint rule for sendgrid api keys."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-github/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e83bae4ac4028a692e5b926c82a6d860"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-github/-/secretlint-rule-github-3.0.0.tgz"
SRC_URI[md5sum] = "be8f2601f1ee9e299e95e744da3990bd"
SRC_URI[sha256sum] = "16945f0104d523c49339e80b0771a636cbfa5e63d21d8010c89b8a3131570f3a"

NPM_PKGNAME = "@secretlint/secretlint-rule-github"

inherit npmhelper
inherit native
