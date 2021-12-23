SUMMARY = "NPM: @secretlint/secretlint-rule-aws"
DESCRIPTION = "A secretlint rule for AWS."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-aws/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-regx-native \
           npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-aws/-/secretlint-rule-aws-4.1.3.tgz"
SRC_URI[md5sum] = "73c38b717352afe532ff01716678569d"
SRC_URI[sha256sum] = "3313fe6b46325325734b0f3df187559472da02139cba5ad94b7b8782a3d91e22"

NPM_PKGNAME = "@secretlint/secretlint-rule-aws"

inherit npmhelper
inherit native
