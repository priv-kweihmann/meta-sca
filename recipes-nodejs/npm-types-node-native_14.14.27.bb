SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.27.tgz"
SRC_URI[md5sum] = "704392b27ab407c7e5adde02823ac546"
SRC_URI[sha256sum] = "07f39372dd5080c369c2d1a18904308998159ef7f75d402256ad9c0064f8ba82"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
