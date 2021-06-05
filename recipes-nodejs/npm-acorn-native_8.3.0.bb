SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33e8b86a084578431a31c72608f226b8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.3.0.tgz"
SRC_URI[md5sum] = "c717d4d413811a0ea44f27efb33f6f41"
SRC_URI[sha256sum] = "c642dc7bf6f970c94d2f514f741a4baa40bf03e8a4a4daae3a90241bde080434"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
