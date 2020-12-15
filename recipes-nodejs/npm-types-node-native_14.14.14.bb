SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.14.tgz"
SRC_URI[md5sum] = "b0edd04da6a448d57230f39e7b163fac"
SRC_URI[sha256sum] = "1fb8e10896baf5d0cc5a3d326008eb8dbf3565b558e7f5d4de5abc8229b30a8c"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
