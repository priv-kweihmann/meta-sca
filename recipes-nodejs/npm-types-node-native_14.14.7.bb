SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.7.tgz"
SRC_URI[md5sum] = "0a155ecd227aee616425718d15b5347b"
SRC_URI[sha256sum] = "55c63007ac80e83f10565eed3831f7d838a34791c341ef1b7cf66cf0930e5b4d"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
