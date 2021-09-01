SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-16.7.10.tgz"
SRC_URI[md5sum] = "89fedff9e08fcb69c932a2e095102dc2"
SRC_URI[sha256sum] = "e2a16c73c62158506d312fb5a841b84b29eeb77f6dc606465e58ad06c6ecbc93"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
