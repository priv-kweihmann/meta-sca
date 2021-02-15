SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.28.tgz"
SRC_URI[md5sum] = "7747e33e5347d2987e6313a761cbefc1"
SRC_URI[sha256sum] = "60647bb0552272ff091319cc52b94b6f3f039a8430956ea20ad7567e881e2ac1"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
