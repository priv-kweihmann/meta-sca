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

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-secp256k1-privatekey/-/secretlint-rule-secp256k1-privatekey-5.0.1.tgz"
SRC_URI[md5sum] = "aa516f34de993cf5cf05ad7fab8e76cc"
SRC_URI[sha256sum] = "c989e8be0e907293bffa0f7a26a81fd3cb0df5fbe074193c2a633980037255c7"

NPM_PKGNAME = "@secretlint/secretlint-rule-secp256k1-privatekey"

inherit npmhelper
inherit native
