SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.25.tgz"
SRC_URI[md5sum] = "e5f2d02d2935955ee91286db525c720a"
SRC_URI[sha256sum] = "597ac3b8a546dbf4a0b6c1c21693044835962fe47d8bf5abc74c7dbc39d580c6"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
