SUMMARY = "NPM: textlint-rule-ginger"
DESCRIPTION = "textlint rule to check your English grammar with Ginger Proofreading"
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-ginger"

DEPENDS = "npm-es6-promisify-native npm-gingerbread-native npm-textlint-regexp-string-matcher-native npm-textlint-rule-helper-native npm-textlint-util-to-string-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://ReadMe.md;beginline=60;md5=355b64b34f8b0e8810c4e72a77859cc2"

SRC_URI = "https://registry.npmjs.org/textlint-rule-ginger/-/textlint-rule-ginger-2.2.1.tgz"
SRC_URI[md5sum] = "7d385ef58e5632d10313e6d49ceffcc4"
SRC_URI[sha256sum] = "464cbe8a5e1e2fe550b875da5af1c185a5f91cbd6ffcca6871be8dbf06cd3b3e"

NPM_PKGNAME = "textlint-rule-ginger"

inherit npmhelper
inherit native
