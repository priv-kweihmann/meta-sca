SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.11.tgz"
SRC_URI[md5sum] = "5e850ab5dc6b9e69bebfefb3418d19d1"
SRC_URI[sha256sum] = "7dc170695ebdf79609ce8c8a99c765c78c9d9d1ef0d8caed008b7f1fa766fa4a"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
