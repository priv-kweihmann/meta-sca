SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33e8b86a084578431a31c72608f226b8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.1.1.tgz"
SRC_URI[md5sum] = "8fe078713ed658fcbdc05e5b7913ec30"
SRC_URI[sha256sum] = "e4e7b5ed6efeee1a54daf6894123f0733fee24501ac8032a3ee5c550c25f8cc9"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
