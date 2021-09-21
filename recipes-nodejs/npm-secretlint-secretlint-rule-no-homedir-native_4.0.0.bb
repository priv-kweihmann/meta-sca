SUMMARY = "NPM: @secretlint/secretlint-rule-no-homedir"
DESCRIPTION = "A secretlint rule that disallow to include user's homedir path."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-homedir/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-escape-string-regexp-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-homedir/-/secretlint-rule-no-homedir-4.0.0.tgz"
SRC_URI[md5sum] = "7f049bdba884d04822f52108483d42e3"
SRC_URI[sha256sum] = "104c46d0ac548380a4aa635f792645ecaff8766fe1b57cdd16c06f50e3750c88"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-homedir"

inherit npmhelper
inherit native
