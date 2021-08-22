SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-16.7.1.tgz"
SRC_URI[md5sum] = "902a36eecf442530e340a9b5eef370d2"
SRC_URI[sha256sum] = "ad3f09f4a8a97e61f50abadec467cde543de648ae6e7786f288ea435898f05b7"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
