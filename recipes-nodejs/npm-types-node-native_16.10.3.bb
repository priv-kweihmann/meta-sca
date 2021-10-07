SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-16.10.3.tgz"
SRC_URI[md5sum] = "37d9bde5bf1db2122e4c8e627ce2a918"
SRC_URI[sha256sum] = "53d5a576b3056a87a35a6ad7d49c03394930d21fab70afeb560d9536cb0703fa"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
