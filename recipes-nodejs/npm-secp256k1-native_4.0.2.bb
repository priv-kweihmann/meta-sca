SUMMARY = "NPM: secp256k1"
DESCRIPTION = "This module provides native bindings to ecdsa secp256k1 functions"
HOMEPAGE = "https://github.com/cryptocoinjs/secp256k1-node#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e52095b8ccbb6567448b1d4964a4c45b"

DEPENDS = "npm-elliptic-native \
           npm-node-addon-api-native \
           npm-node-gyp-build-native"

SRC_URI = "https://registry.npmjs.org/secp256k1/-/secp256k1-4.0.2.tgz"
SRC_URI[md5sum] = "c7b39703f9da8b69a5c28ca5b86635dc"
SRC_URI[sha256sum] = "548b1a10bcf90be85ede62fa6742ad7c733cca704f9d082a6b8542ba26c9f108"

NPM_PKGNAME = "secp256k1"

inherit npmhelper
inherit native
