SUMMARY = "NPM: @types/node"
DESCRIPTION = "TypeScript definitions for Node.js"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/node/-/node-14.14.37.tgz"
SRC_URI[md5sum] = "503c3b7028bb60dcde654d597dfbe3ec"
SRC_URI[sha256sum] = "9b7602aaf382520b6bab58941ac5d833b3780ff81f4b74cbfa09da587492bb0d"

NPM_PKGNAME = "@types/node"

inherit npmhelper
inherit native

S = "${WORKDIR}/node"
