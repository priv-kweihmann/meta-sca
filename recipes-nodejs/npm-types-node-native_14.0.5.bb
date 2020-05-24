SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.0.5.tgz"
SRC_URI[md5sum] = "2b885ae7a077d13a191fd284d9f0819b"
SRC_URI[sha256sum] = "7d76c434cb58d2c897cd831a0096d8798a7cdfef2611c2673a7e27c615e17406"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
