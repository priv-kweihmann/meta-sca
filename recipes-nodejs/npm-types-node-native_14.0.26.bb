SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.0.26.tgz"
SRC_URI[md5sum] = "938f9f6cc5cfe69de816497236cfc6b7"
SRC_URI[sha256sum] = "ea7d421a9766a1f52bfb40c12d7e1e062cf252c89cfe0eebdbed9664ab826de4"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
