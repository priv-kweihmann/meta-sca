SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.13.tgz"
SRC_URI[md5sum] = "19a5f9e73b2bbe52361c8c47544abf2e"
SRC_URI[sha256sum] = "5bfa3c5a633b86f493436be2bc0eef86621802946e1770fd6abfd11020c56938"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
