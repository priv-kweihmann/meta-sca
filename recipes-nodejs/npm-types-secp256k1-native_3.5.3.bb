SUMMARY = "NPM: @types/secp256k1"
DESCRIPTION = "TypeScript definitions for secp256k1"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27e94c0280987ab296b0b8dd02ab9fe5"

DEPENDS = "npm-types-node-native"

SRC_URI = "https://registry.npmjs.org/@types/secp256k1/-/secp256k1-3.5.3.tgz"
SRC_URI[md5sum] = "2b669c736b29287eabcb0d68ecc7c1bb"
SRC_URI[sha256sum] = "c4d5c1c9ed2b8ff58e8ed8134c90210d587f9c7f3b9ac1d6c08e45c257953da4"

NPM_PKGNAME = "@types/secp256k1"

inherit npmhelper
inherit native

S = "${WORKDIR}/secp256k1"
