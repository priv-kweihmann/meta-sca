SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.6.0.tgz"
SRC_URI[md5sum] = "e1faaf8aecfe59d13e6535719b70147b"
SRC_URI[sha256sum] = "be986f1eb74b71824a189c8dc799e92924b1a8f321d71383feb4fa2530de8305"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
