SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33e8b86a084578431a31c72608f226b8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.7.0.tgz"
SRC_URI[md5sum] = "7597c3b82fc41b14e1b1602fe2013b94"
SRC_URI[sha256sum] = "3e6790e5a1b31dfbfc833f237d07ad1851732de65462e69f0a1ac727dc16bafd"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
