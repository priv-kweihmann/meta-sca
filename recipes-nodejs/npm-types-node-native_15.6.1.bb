SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-15.6.1.tgz"
SRC_URI[md5sum] = "f16288c478e976509b7af842def3265c"
SRC_URI[sha256sum] = "5f1bf604f40c74ce1120e8114ec127ca0e2026749767c0de5e09e2bed2efd170"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
