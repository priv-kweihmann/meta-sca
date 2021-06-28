SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-15.12.5.tgz"
SRC_URI[md5sum] = "a787076fe4b155169ce9dfa16eee3cf8"
SRC_URI[sha256sum] = "b1ffd5a5a1b980b487f463894891786ea72a39cee05cdcc21ac749ab65eaf8f9"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
