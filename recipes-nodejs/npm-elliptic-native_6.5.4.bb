SUMMARY = "NPM: elliptic"
DESCRIPTION = "EC cryptography"
HOMEPAGE = "https://github.com/indutny/elliptic"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=211;md5=42a070570f54c5a10aa6a3aa16a967e3"

DEPENDS = "npm-bn.js-native \
           npm-brorand-native \
           npm-hash.js-native \
           npm-hmac-drbg-native \
           npm-inherits-native \
           npm-minimalistic-assert-native \
           npm-minimalistic-crypto-utils-native"

SRC_URI = "https://registry.npmjs.org/elliptic/-/elliptic-6.5.4.tgz"
SRC_URI[md5sum] = "48b20a9f1826a2b4410e9591540d8800"
SRC_URI[sha256sum] = "2435ce5afcb6881ec0a7d5b31b0820d30664bd529a54439928da60c02e45c5be"

NPM_PKGNAME = "elliptic"

inherit npmhelper
inherit native
