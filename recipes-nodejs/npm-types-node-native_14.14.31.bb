SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.31.tgz"
SRC_URI[md5sum] = "831a6eac0c8b52cbbe702d0c375856c9"
SRC_URI[sha256sum] = "ea6193f766e098e5208a559a8d0a0127b247c9c5ba7f63fe5e5c89a802d20579"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
