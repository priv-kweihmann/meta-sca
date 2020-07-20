SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.0.23.tgz"
SRC_URI[md5sum] = "21d78d6e8bb964dadd18dd4da30e2778"
SRC_URI[sha256sum] = "bc8bc1888645d2e428aa35338b86a0e2e6254586873a3436985a4f9aedd535e0"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
