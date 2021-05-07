SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-15.0.2.tgz"
SRC_URI[md5sum] = "4b9047bf90f40cbcd64a85f6470ccc5d"
SRC_URI[sha256sum] = "c0459ec4eb134286afc2f4bf9292a7e93c009dbbff0cacc43b91a9fc4f2a4aec"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
