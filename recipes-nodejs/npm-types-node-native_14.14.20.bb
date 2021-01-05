SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.20.tgz"
SRC_URI[md5sum] = "c9e102a4234eb3bca01edee51c6a2031"
SRC_URI[sha256sum] = "eed7b5b10ed1209ce8f32851df67359fb6fc0bc77f0c7d72823466ff8b0a32d7"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
