SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.0.4.tgz"
SRC_URI[md5sum] = "9d0938b658e289371dae3aa763af8d79"
SRC_URI[sha256sum] = "10896e1540ff96d702d154f5add4e944114ab75b24b2c049070495e1b98f0198"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
