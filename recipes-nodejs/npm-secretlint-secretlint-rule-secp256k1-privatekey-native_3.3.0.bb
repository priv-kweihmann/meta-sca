SUMMARY = "NPM: @secretlint/secretlint-rule-secp256k1-privatekey"
DESCRIPTION = "A secretlint rule that checks for secp256k1 private keys."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-secp256k1-privatekey/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e83bae4ac4028a692e5b926c82a6d860"

DEPENDS = "npm-bn.js-native \
           npm-secp256k1-native \
           npm-secretlint-types-native \
           npm-types-bn.js-native \
           npm-types-secp256k1-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-secp256k1-privatekey/-/secretlint-rule-secp256k1-privatekey-3.3.0.tgz"
SRC_URI[md5sum] = "1da79745cea8be7da4c1d465cab954a3"
SRC_URI[sha256sum] = "6ce52d785045bc8e9a3674ae6565cd316641161e195d2a8c3c5eaa0952f40b70"

NPM_PKGNAME = "@secretlint/secretlint-rule-secp256k1-privatekey"

inherit npmhelper
inherit native
