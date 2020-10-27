SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.5.tgz"
SRC_URI[md5sum] = "29c2dc430ce6f083a544726134a8f0cc"
SRC_URI[sha256sum] = "29d5834ebb4f0a21b7e3cce2dcb8b09cc96c7686740d61e112ef6ad215aaa641"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
