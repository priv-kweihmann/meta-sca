SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.34.tgz"
SRC_URI[md5sum] = "909f119726d6fc52303bddf164ad63d6"
SRC_URI[sha256sum] = "885895e8caa8ac0bb9666bbb3c168e5d9632d5f3ff5322ebb0e95d1e8ebf5ab0"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
