SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-16.10.4.tgz"
SRC_URI[md5sum] = "18146f535bb4392f9914d6a1c17cc5ea"
SRC_URI[sha256sum] = "154d525efaa7df6d2241e2ebbab1ae0848ba195d54a478077d845ffd4a8df9bb"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
