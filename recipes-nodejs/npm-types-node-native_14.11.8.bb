SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.11.8.tgz"
SRC_URI[md5sum] = "a8f0b953b88e2f288ec3f18d140e295b"
SRC_URI[sha256sum] = "acb72810fa8656723c32a0c7832088877ebd978a25e4f71cb0d4716b1352f3d3"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
