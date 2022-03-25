SUMMARY = "NPM: @secretlint/secretlint-rule-no-homedir"
DESCRIPTION = "A secretlint rule that disallow to include user's homedir path."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-homedir/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-escape-string-regexp-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-homedir/-/secretlint-rule-no-homedir-5.1.1.tgz"
SRC_URI[md5sum] = "58420f04f53aa92861a6367b7eb23382"
SRC_URI[sha256sum] = "56be8db482be1d674b1949ec8b4241f7e46374396697a2637055b519dd62d151"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-homedir"

inherit npmhelper
inherit native
