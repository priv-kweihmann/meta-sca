SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.41.tgz"
SRC_URI[md5sum] = "e6003a4b359f7a49b5536781293777a5"
SRC_URI[sha256sum] = "41f8066029577a121285ca7d27f470655e6be247f46cf0a3cdef864435288bbd"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
