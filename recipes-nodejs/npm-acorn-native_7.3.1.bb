SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe45039e2b759f74d323dc4e4f6cc22b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-7.3.1.tgz"
SRC_URI[md5sum] = "528576a9d308df0b2a03c4da969fe257"
SRC_URI[sha256sum] = "80fcad5efdc6419aef7760e1b9654fa76ee3a35735b3300ff5ca785ff7067767"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
