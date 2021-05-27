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

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-secp256k1-privatekey/-/secretlint-rule-secp256k1-privatekey-2.2.0.tgz"
SRC_URI[md5sum] = "132e722e2d8261a1fdd57a2969ad028c"
SRC_URI[sha256sum] = "f0253a601d32389ea0896434089059c1866ed1453386c9a36eac5e57fc8ec232"

NPM_PKGNAME = "@secretlint/secretlint-rule-secp256k1-privatekey"

inherit npmhelper
inherit native
