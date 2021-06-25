SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33e8b86a084578431a31c72608f226b8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.4.1.tgz"
SRC_URI[md5sum] = "1a1f94fa03947fee73a5fe405d5c7973"
SRC_URI[sha256sum] = "2009aacbc0a28337a9f2e30cd83a0e02363699748d25fdae1acb6d0370445902"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
