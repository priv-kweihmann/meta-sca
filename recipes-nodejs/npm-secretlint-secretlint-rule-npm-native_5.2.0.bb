SUMMARY = "NPM: @secretlint/secretlint-rule-npm"
DESCRIPTION = "A secretlint rule for npm."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-npm/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-npm/-/secretlint-rule-npm-5.2.0.tgz"
SRC_URI[md5sum] = "2f2cfe739119fedbc96bfc5556e528b5"
SRC_URI[sha256sum] = "2d39efeb16ad22c76db511fb1fc8301dcea9a954ef2927f8f557f3a49cf341dc"

NPM_PKGNAME = "@secretlint/secretlint-rule-npm"

inherit npmhelper
inherit native
