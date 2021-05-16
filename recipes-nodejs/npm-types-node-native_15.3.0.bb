SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-15.3.0.tgz"
SRC_URI[md5sum] = "8f00380beee35e57ee6ab326a5a280c8"
SRC_URI[sha256sum] = "0e758d738ebad46722c8e91e3615e4d992e35d3b4ec42190374c9a6572647b58"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
