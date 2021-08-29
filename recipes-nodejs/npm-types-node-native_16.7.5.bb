SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-16.7.5.tgz"
SRC_URI[md5sum] = "83307a4d2d9a4be4ac3ecacfc8705a9d"
SRC_URI[sha256sum] = "d60be7165bacf99a411182f2c9622eb1673d4703b6c61abc38fe9564322bf49b"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
