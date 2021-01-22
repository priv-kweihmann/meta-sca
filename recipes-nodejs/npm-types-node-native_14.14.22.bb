SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.22.tgz"
SRC_URI[md5sum] = "8fa9ec936563056beafea94dc9299c92"
SRC_URI[sha256sum] = "19307095caab902fdafea2f7281c5e6840ae9ec97e4305960f2fa41e12914461"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
