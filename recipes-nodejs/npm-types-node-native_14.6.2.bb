SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.6.2.tgz"
SRC_URI[md5sum] = "b6a76977fff034e3cab24a75a531c3a8"
SRC_URI[sha256sum] = "590096ffa4e8110feb2500e69a40d1f87dbe3c9c839ff5557435cc4ae6739100"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
