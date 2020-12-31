SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.17.tgz"
SRC_URI[md5sum] = "5e81ff4b36a0b1d45e389aa38528b35b"
SRC_URI[sha256sum] = "2c7d206687645cd807dac38ff55aa3c97321b5287ec099ee969fc1c41228a977"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
