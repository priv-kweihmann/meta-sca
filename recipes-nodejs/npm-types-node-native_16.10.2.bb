SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-16.10.2.tgz"
SRC_URI[md5sum] = "da1105e35fc597f31c717d4ef36fb5e2"
SRC_URI[sha256sum] = "d78194653de1d44e05b529e9b59763ae51cd8fd69ef9d1fdd90c6022fbec658a"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
