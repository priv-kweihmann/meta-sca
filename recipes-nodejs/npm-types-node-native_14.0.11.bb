SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.0.11.tgz"
SRC_URI[md5sum] = "bd0c48f4c7dbb6abe44fcc8a0b232ab0"
SRC_URI[sha256sum] = "089fd56d3cf72d41495a78602371feffa46b2873ee128bc27173c3bbd7ec1aa9"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
