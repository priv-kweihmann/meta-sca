SUMMARY = "NPM: @secretlint/secretlint-rule-slack"
DESCRIPTION = "A secretlint rule for slack."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-slack/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-string.prototype.matchall-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-slack/-/secretlint-rule-slack-2.2.0.tgz"
SRC_URI[md5sum] = "62d526cdfdc1d658853edd68e65d2a21"
SRC_URI[sha256sum] = "e0d54a2543f2e9679c5132eb2734a08529140f003d9a88a0e09b7e0cde33dc0f"

NPM_PKGNAME = "@secretlint/secretlint-rule-slack"

inherit npmhelper
inherit native
