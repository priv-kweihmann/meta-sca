SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.10.3.tgz"
SRC_URI[md5sum] = "5344a2b493785d6de08d25d8181986df"
SRC_URI[sha256sum] = "2f4d9368a1adb4327568b476feaf660073d66b35fd18839fa6a44cc0bb115e49"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
