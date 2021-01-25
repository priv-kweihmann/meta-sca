SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33e8b86a084578431a31c72608f226b8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.0.5.tgz"
SRC_URI[md5sum] = "9c02719275e67c5f8ecd106f404a9fc6"
SRC_URI[sha256sum] = "0dfe20a069e092085305e72cacb195e2b306538f4760bb8b5a22516e7944f39d"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
