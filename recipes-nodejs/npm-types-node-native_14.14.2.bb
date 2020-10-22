SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.2.tgz"
SRC_URI[md5sum] = "dbbbed4743040de3547bae3ce9d41bf7"
SRC_URI[sha256sum] = "6c81d26b312ba44787d0c631b85dbbe3866ffb9a6857c9bbecd13e0a5cff23a9"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
