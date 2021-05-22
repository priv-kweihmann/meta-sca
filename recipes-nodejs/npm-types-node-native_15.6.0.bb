SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-15.6.0.tgz"
SRC_URI[md5sum] = "4bf9a7b034513d64fa24063438b16375"
SRC_URI[sha256sum] = "1db54316dc854a89b9298c4f2956c8e1f36a862830df6e7358a01ef04a354ff0"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
