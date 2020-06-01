SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.0.6.tgz"
SRC_URI[md5sum] = "c9c1db132ddaaec9b271b66349e57bed"
SRC_URI[sha256sum] = "4ab50d118a8e1d433f0313fdefd50ecf51a40930c237991bb6e7881d629a8e46"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
