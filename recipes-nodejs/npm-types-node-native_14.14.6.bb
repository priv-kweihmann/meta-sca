SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.6.tgz"
SRC_URI[md5sum] = "73988d1f07ab93ace7475956ea705ce9"
SRC_URI[sha256sum] = "d66c1bdf35f9c6ae897ddbce06556f26c506d9f06af2067cdf963f9948540de6"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
