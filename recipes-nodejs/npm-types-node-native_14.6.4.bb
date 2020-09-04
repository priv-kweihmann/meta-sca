SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.6.4.tgz"
SRC_URI[md5sum] = "3b8bcff75a6148f271705ccd3b216d29"
SRC_URI[sha256sum] = "ebac6eeea388d9efc93a712decf63f47b735884ec4c4e7592016610a192c74ce"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
