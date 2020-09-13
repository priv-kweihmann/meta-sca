SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.10.1.tgz"
SRC_URI[md5sum] = "ebe532dd405c28bd4f81aa97ee974c9b"
SRC_URI[sha256sum] = "6266d57ba0095af4dc6decad63a2e41a42eb888db6a95f25258a793edb063c7c"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
