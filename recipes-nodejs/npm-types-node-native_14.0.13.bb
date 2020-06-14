SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.0.13.tgz"
SRC_URI[md5sum] = "e1d10fa64ccf6c390d511edb44bcd5a2"
SRC_URI[sha256sum] = "beb80321f96940d3f250ead5dcffcd35cb2f3e5a71696802ba9993912d6260c0"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
