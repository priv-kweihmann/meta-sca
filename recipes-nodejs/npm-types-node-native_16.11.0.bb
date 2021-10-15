SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-16.11.0.tgz"
SRC_URI[md5sum] = "a3553866594ac0968d63a05732299184"
SRC_URI[sha256sum] = "72b8b4be959e89a80b4db7778108db55b6d8fe1395515fb74dc8a007189102e8"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
