SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.11.10.tgz"
SRC_URI[md5sum] = "880bcb903b32b2f2cf00a9b43d06d9e2"
SRC_URI[sha256sum] = "55d4b553c391972f7aff36d8ca427f8ab4ce56c9b99190884defca796731aac9"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
