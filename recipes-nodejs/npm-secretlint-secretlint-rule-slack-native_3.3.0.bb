SUMMARY = "NPM: @secretlint/secretlint-rule-slack"
DESCRIPTION = "A secretlint rule for slack."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-slack/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-slack/-/secretlint-rule-slack-3.3.0.tgz"
SRC_URI[md5sum] = "182280a8fe66a1642abbef7e4ecd707d"
SRC_URI[sha256sum] = "5e15a0145786354eb79a576ce9441539099f004034138b8047523dde4afb9b06"

NPM_PKGNAME = "@secretlint/secretlint-rule-slack"

inherit npmhelper
inherit native
