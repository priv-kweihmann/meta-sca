SUMMARY = "NPM: @secretlint/secretlint-rule-aws"
DESCRIPTION = "A secretlint rule for AWS."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-aws/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-regx-native \
           npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-aws/-/secretlint-rule-aws-5.1.1.tgz"
SRC_URI[md5sum] = "f27a507523297b08e3ce9117a9d1eb38"
SRC_URI[sha256sum] = "e0186210ac5e794b35a03c86a2a279b673b9bc23a383981540d5674db0b3fced"

NPM_PKGNAME = "@secretlint/secretlint-rule-aws"

inherit npmhelper
inherit native
