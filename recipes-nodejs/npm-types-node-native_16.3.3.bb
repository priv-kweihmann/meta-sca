SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-16.3.3.tgz"
SRC_URI[md5sum] = "a4dd27da2ad930c8c2cbaa3d42b408c2"
SRC_URI[sha256sum] = "6fbea63280d7c57b27035a66da8b14142a0bc2007ce7cc0ce3ce3143739be5cf"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
