SUMMARY = "NPM: @types/secp256k1"
DESCRIPTION = "TypeScript definitions for secp256k1"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/secp256k1"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-node-native"

SRC_URI = "https://registry.npmjs.org/@types/secp256k1/-/secp256k1-4.0.3.tgz"
SRC_URI[md5sum] = "d49ab73b254eccd23d4a9292c845dea2"
SRC_URI[sha256sum] = "0dfd70de540b5239c9eb719cd724ec1d7a5db0fc052a5d0a8608b466fa1f9254"

NPM_PKGNAME = "@types/secp256k1"

inherit npmhelper
inherit native

S = "${WORKDIR}/secp256k1"
