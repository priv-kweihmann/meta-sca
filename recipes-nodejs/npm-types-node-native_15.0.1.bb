SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-15.0.1.tgz"
SRC_URI[md5sum] = "e3d564e0432ed4c76344ca33f9a789ec"
SRC_URI[sha256sum] = "532dccefc8f8088de91a47a924ea1f478738cad955216817b4aa555b9018c4aa"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
