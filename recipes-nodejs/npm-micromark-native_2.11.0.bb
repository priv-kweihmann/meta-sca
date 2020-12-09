SUMMARY = "NPM: micromark"
DESCRIPTION = "small commonmark compliant markdown parser with positional info and concrete tokens"
HOMEPAGE = "https://github.com/micromark/micromark#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-debug-native \
           npm-parse-entities-native"

SRC_URI = "https://registry.npmjs.org/micromark/-/micromark-2.11.0.tgz"
SRC_URI[md5sum] = "ec62b27b5600117573240500b29eb6ae"
SRC_URI[sha256sum] = "721f2dae7b17bba45ccb41a73ed3ff580ead201c06ed3af48a5180aed7c949e6"

NPM_PKGNAME = "micromark"

inherit npmhelper
inherit native
