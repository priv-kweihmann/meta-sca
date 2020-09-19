SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.11.1.tgz"
SRC_URI[md5sum] = "fd55602bd4cde7287d9771dcee8bcbda"
SRC_URI[sha256sum] = "6451eb7ae6dcf66c5032c5b1e5c752330f34b067740eae3c85830e2607187e80"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
