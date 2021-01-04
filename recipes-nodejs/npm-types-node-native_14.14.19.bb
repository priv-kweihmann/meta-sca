SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.19.tgz"
SRC_URI[md5sum] = "7a2fe206af3dcfd98f0cd6186df37700"
SRC_URI[sha256sum] = "59781376422b29e95ea33774e7c8496c3c6b91ed76139e6d4a904b315d0ad02d"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
