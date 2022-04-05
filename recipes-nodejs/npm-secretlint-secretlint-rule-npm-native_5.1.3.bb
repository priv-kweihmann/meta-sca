SUMMARY = "NPM: @secretlint/secretlint-rule-npm"
DESCRIPTION = "A secretlint rule for npm."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-npm/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-npm/-/secretlint-rule-npm-5.1.3.tgz"
SRC_URI[md5sum] = "d66d4f2d2ffd7ec8586c01e96f063f83"
SRC_URI[sha256sum] = "dac1df1db86494e5a9f9b456c8941c1029b607eec2114e5fcab10629c3a2e966"

NPM_PKGNAME = "@secretlint/secretlint-rule-npm"

inherit npmhelper
inherit native
