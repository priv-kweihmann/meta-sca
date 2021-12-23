SUMMARY = "NPM: textlint-rule-no-exclamation-question-mark"
DESCRIPTION = "textlint rule that disallow exclamation and question mark."
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-no-exclamation-question-mark"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-match-index-native \
           npm-textlint-regexp-string-matcher-native \
           npm-textlint-rule-helper-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-no-exclamation-question-mark/-/textlint-rule-no-exclamation-question-mark-1.1.0.tgz"
SRC_URI[md5sum] = "ed8060cfe09920c068ed04f7eeba47b1"
SRC_URI[sha256sum] = "8ff5df8598484195b88fdd2c6ff0f11d4d2f3ab14a2779dcbf071e7900d9bb22"

NPM_PKGNAME = "textlint-rule-no-exclamation-question-mark"

inherit npmhelper
inherit native
