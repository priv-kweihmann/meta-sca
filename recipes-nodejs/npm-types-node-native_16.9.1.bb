SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-16.9.1.tgz"
SRC_URI[md5sum] = "bac235dbf4e88a4682eb3001dd32d374"
SRC_URI[sha256sum] = "e2ece7d8a4499d692885208aec9688729fd51e21eb6f0a1964d419afb4006b6c"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
