SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.0.9.tgz"
SRC_URI[md5sum] = "ce10d2605c1783b2291d25db387700d6"
SRC_URI[sha256sum] = "d9d8b22a77bd19910c5d69b04ab0d540aeb472dfd8633d2af70d2163a899fc88"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
