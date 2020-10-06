SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.11.5.tgz"
SRC_URI[md5sum] = "2e4c5b4372eeb4b3010d220622231ec7"
SRC_URI[sha256sum] = "71214491f31cb172c9dd1edb031af18377624b49cc013e5a1e0b2d476b2052e5"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
