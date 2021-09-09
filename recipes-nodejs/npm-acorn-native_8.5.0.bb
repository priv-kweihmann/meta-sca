SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33e8b86a084578431a31c72608f226b8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.5.0.tgz"
SRC_URI[md5sum] = "7726bfa84af411a8a65c6b42a9a7c063"
SRC_URI[sha256sum] = "d8f9d40c4656537a60bf0c6daae6f0553f54df5ff2518f86464b7c785f20376b"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
