SUMMARY = "NPM: secp256k1"
DESCRIPTION = "This module provides native bindings to ecdsa secp256k1 functions"
HOMEPAGE = "{homepage}"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e52095b8ccbb6567448b1d4964a4c45b"

DEPENDS = "npm-elliptic-native \
           npm-node-addon-api-native \
           npm-node-gyp-build-native"

SRC_URI = "https://registry.npmjs.org/secp256k1/-/secp256k1-4.0.3.tgz"
SRC_URI[md5sum] = "9dfbd1b7b8c00fe72853877cdc2644ac"
SRC_URI[sha256sum] = "949f88eb57429b076496448cdd32d20eff13c770225647054e6645e433a5b55b"

NPM_PKGNAME = "secp256k1"

inherit npmhelper
inherit native

do_install:append() {
    rm -rf ${D}${libdir}/node_modules/@types/secp256k1
}
