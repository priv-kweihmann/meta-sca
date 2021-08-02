SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-16.4.10.tgz"
SRC_URI[md5sum] = "1bc41e1e9001b7addf07a274ffb13f66"
SRC_URI[sha256sum] = "9c289d6873518e122bb51f968c715f18db2c637dc55c1441957fea5e5c89761a"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
