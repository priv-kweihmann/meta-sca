SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-15.12.2.tgz"
SRC_URI[md5sum] = "1c177b57468535bf5c7c7fa3b2ea913e"
SRC_URI[sha256sum] = "80b598f13ce6e1d5f0d7267ea5bae1ba300cc24ec0dda618fc1f5ac050a6f566"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
