SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.8.tgz"
SRC_URI[md5sum] = "e1c036332e558b0135f0de5de8f0725f"
SRC_URI[sha256sum] = "d463c0e90c2334c092476b33c4773cdcd65fa39c5f33a99a8bdf93ca35f10aaf"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
