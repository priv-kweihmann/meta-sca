SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33e8b86a084578431a31c72608f226b8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.2.4.tgz"
SRC_URI[md5sum] = "56ad9f19e2bfc37a0a0c319b34edf783"
SRC_URI[sha256sum] = "bdddcce539dfe47877d5a390e11543c9a3555a0bca313ed5320c2bdd1b316337"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
