SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33e8b86a084578431a31c72608f226b8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.4.0.tgz"
SRC_URI[md5sum] = "759710917a35333d5a753495809f039d"
SRC_URI[sha256sum] = "ff06c3073f59682ada9fb139270b858725aa87a9bb0bb051afad1bf9552bc8ff"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
