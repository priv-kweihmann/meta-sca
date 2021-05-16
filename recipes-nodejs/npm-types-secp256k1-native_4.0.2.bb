SUMMARY = "NPM: @types/secp256k1"
DESCRIPTION = "TypeScript definitions for secp256k1"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-types-node-native"

SRC_URI = "https://registry.npmjs.org/@types/secp256k1/-/secp256k1-4.0.2.tgz"
SRC_URI[md5sum] = "3d8d473b0a9ae09ee019abc41ecd98f8"
SRC_URI[sha256sum] = "9cf6f17a4ce92764c260123ccff94d58e0a67fa9b833a29778f58590992d1bdf"

NPM_PKGNAME = "@types/secp256k1"

inherit npmhelper
inherit native

S = "${WORKDIR}/secp256k1"
