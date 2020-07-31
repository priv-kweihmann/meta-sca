SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.0.27.tgz"
SRC_URI[md5sum] = "af230a0a0d36eae586ef6d4483ec725b"
SRC_URI[sha256sum] = "e275261b503f59b45b3f47ea46a88636c0ccbf3db437d05cc4a7ea600865ccca"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
