SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.0.14.tgz"
SRC_URI[md5sum] = "0f1d4bcaf1695a951ad718c98a42112b"
SRC_URI[sha256sum] = "232833924e8362f956ae321af8282399c2cb72c17a5a6d3f3cb0edbe89e14420"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
