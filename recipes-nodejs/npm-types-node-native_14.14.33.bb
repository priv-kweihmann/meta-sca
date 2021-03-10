SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.33.tgz"
SRC_URI[md5sum] = "754a527a6b1bd65beb8299fb93997dae"
SRC_URI[sha256sum] = "803fd999a315521616d472129762b2dad8d39f14e486f3d56a379006e1f85b78"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
