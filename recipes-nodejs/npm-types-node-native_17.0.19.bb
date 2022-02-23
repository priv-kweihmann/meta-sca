SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-17.0.19.tgz"
SRC_URI[md5sum] = "8a2bee2c94be350003f9d8c30011b9a9"
SRC_URI[sha256sum] = "139fbc3a13eec28d14601b01d66a42d9d8e18f4aace59dc430ad5dc83c9c4f77"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
