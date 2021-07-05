SUMMARY = "NPM: @secretlint/secretlint-rule-gcp"
DESCRIPTION = "A secretlint rule for GCP."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-gcp/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-node-forge-native \
           npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-gcp/-/secretlint-rule-gcp-3.3.0.tgz"
SRC_URI[md5sum] = "ae073877b0d2c140677f02f87368d8f2"
SRC_URI[sha256sum] = "0cd01d5202fe9d76e67318b5c98ba1518e35eba631880e7cdcaac6475493dcb3"

NPM_PKGNAME = "@secretlint/secretlint-rule-gcp"

inherit npmhelper
inherit native
