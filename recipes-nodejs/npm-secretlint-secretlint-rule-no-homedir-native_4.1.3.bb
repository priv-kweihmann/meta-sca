SUMMARY = "NPM: @secretlint/secretlint-rule-no-homedir"
DESCRIPTION = "A secretlint rule that disallow to include user's homedir path."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-homedir/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-escape-string-regexp-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-homedir/-/secretlint-rule-no-homedir-4.1.3.tgz"
SRC_URI[md5sum] = "00330ef95a770543712cc90c4d1af417"
SRC_URI[sha256sum] = "9256b2a611aec3e1b6fe61e0397b31e839aeabf70fd06f5aaee0db32e7361e53"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-homedir"

inherit npmhelper
inherit native
