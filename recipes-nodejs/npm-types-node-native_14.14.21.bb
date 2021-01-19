SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.21.tgz"
SRC_URI[md5sum] = "cebaff02a77e988c5bd986034f44c23d"
SRC_URI[sha256sum] = "f84bf4dc2b7d53c365eee3aeedf6d3230fdba00a6e4fa091e106b93c3b513de6"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
