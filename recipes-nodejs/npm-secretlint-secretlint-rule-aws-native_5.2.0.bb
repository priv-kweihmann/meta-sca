SUMMARY = "NPM: @secretlint/secretlint-rule-aws"
DESCRIPTION = "A secretlint rule for AWS."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-aws/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-regx-native \
           npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-aws/-/secretlint-rule-aws-5.2.0.tgz"
SRC_URI[md5sum] = "b847daa9a358dc4edc88150f3af675ba"
SRC_URI[sha256sum] = "1b1b2af76ed9cb54b6ad2bdd9ba84a28a735a515c9ad558fa89c95714d47ce23"

NPM_PKGNAME = "@secretlint/secretlint-rule-aws"

inherit npmhelper
inherit native
