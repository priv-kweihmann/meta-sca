SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-16.9.4.tgz"
SRC_URI[md5sum] = "f1b52bfcea8cc34e1bcf4a5e0cbb0e07"
SRC_URI[sha256sum] = "e3238c87217f57d8f2667556a39e347a43b74a8db645acac17f016d63edd7385"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
