SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.35.tgz"
SRC_URI[md5sum] = "a34fe01f4f2ee1a7125f8f516916c144"
SRC_URI[sha256sum] = "3f77cee60a147c3b4553f209867210dc4c23daa6f47e0fd3b86b153c29ea4b95"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
