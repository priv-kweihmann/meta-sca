SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe45039e2b759f74d323dc4e4f6cc22b"

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-7.2.0.tgz"
SRC_URI[md5sum] = "165bd599b33034feddfca4a8d3aed74f"
SRC_URI[sha256sum] = "669340641169266e7b6d8ddb6ddeef374a6bc6257f67e123f58530a4ea0a6ea5"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
