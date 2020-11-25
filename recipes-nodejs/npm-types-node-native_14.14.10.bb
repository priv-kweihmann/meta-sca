SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.10.tgz"
SRC_URI[md5sum] = "087226c3aa942bf1afc4e8bd3602df43"
SRC_URI[sha256sum] = "fb2638be855f0b48e360180fb9f0eb3b05f91f28eba1537f6536a50c4974d47a"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
