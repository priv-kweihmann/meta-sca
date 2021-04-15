SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.39.tgz"
SRC_URI[md5sum] = "193f26fb8327bb5fa47b6624b345c2d0"
SRC_URI[sha256sum] = "d23fa8d59fa5bcb835ec2461dd23fe4c2f343022b06bce7afc31e510b3456945"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
