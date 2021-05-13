SUMMARY = "NPM: @secretlint/secretlint-rule-slack"
DESCRIPTION = "A secretlint rule for slack."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-slack/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-string.prototype.matchall-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-slack/-/secretlint-rule-slack-2.1.1.tgz"
SRC_URI[md5sum] = "05625a3bc862ca642170bea529ff0592"
SRC_URI[sha256sum] = "f3bbf3650af2120d3cbffe77fdc0214016826c07efa90f8405025497a704a056"

NPM_PKGNAME = "@secretlint/secretlint-rule-slack"

inherit npmhelper
inherit native
