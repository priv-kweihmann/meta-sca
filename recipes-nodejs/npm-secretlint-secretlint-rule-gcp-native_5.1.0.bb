SUMMARY = "NPM: @secretlint/secretlint-rule-gcp"
DESCRIPTION = "A secretlint rule for GCP."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-gcp/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-node-forge-native \
           npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-gcp/-/secretlint-rule-gcp-5.1.0.tgz"
SRC_URI[md5sum] = "fa0b31d378ba5240c65c5ee6d6b11bcc"
SRC_URI[sha256sum] = "13cbe78284b0afd4307141e6bb3c21d39066c160b56a098c2969f196293a9a86"

NPM_PKGNAME = "@secretlint/secretlint-rule-gcp"

inherit npmhelper
inherit native
