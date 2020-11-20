SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.9.tgz"
SRC_URI[md5sum] = "7fc8a3655d7c6f894506f1bb1de39666"
SRC_URI[sha256sum] = "a1046d340fbfa4902e141e3829190749fee3e7fe2d0d3fd9bf6908823ed5aa51"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
