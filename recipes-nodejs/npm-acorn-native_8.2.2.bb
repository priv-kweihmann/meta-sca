SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33e8b86a084578431a31c72608f226b8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.2.2.tgz"
SRC_URI[md5sum] = "f621b683633f0ce8d34e5cf7cdbb58cb"
SRC_URI[sha256sum] = "0d140fd2119e6625c4d7caa0f59c7f1616993119797496d738d1f54ddc1eb48b"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
