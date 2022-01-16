SUMMARY = "NPM: @secretlint/secretlint-rule-gcp"
DESCRIPTION = "A secretlint rule for GCP."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-gcp/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-node-forge-native \
           npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-gcp/-/secretlint-rule-gcp-4.1.4.tgz"
SRC_URI[md5sum] = "73615b2e7cb9541d08bcfdb420e3bad1"
SRC_URI[sha256sum] = "9006019495292ea472c0af26d903208d46a2084e32f93ce5bdd86fe6cafdafbc"

NPM_PKGNAME = "@secretlint/secretlint-rule-gcp"

inherit npmhelper
inherit native
