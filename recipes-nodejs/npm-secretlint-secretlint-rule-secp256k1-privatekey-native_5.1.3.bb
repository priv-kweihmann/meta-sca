SUMMARY = "NPM: @secretlint/secretlint-rule-secp256k1-privatekey"
DESCRIPTION = "A secretlint rule that checks for secp256k1 private keys."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-secp256k1-privatekey/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e83bae4ac4028a692e5b926c82a6d860"

DEPENDS = "npm-bn.js-native \
           npm-secp256k1-native \
           npm-secretlint-types-native \
           npm-types-bn.js-native \
           npm-types-secp256k1-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-secp256k1-privatekey/-/secretlint-rule-secp256k1-privatekey-5.1.3.tgz"
SRC_URI[md5sum] = "8579d5bb999d70172f838ed11f6513bf"
SRC_URI[sha256sum] = "726e6686abbe958fc3741dce9e89d9eb59f3ec1418f97f1210b49863e1641306"

NPM_PKGNAME = "@secretlint/secretlint-rule-secp256k1-privatekey"

inherit npmhelper
inherit native
