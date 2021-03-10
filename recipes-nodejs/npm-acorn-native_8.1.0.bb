SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33e8b86a084578431a31c72608f226b8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.1.0.tgz"
SRC_URI[md5sum] = "564e3fe2667a24f3f73dde2f79bf81dd"
SRC_URI[sha256sum] = "6412ae7f4e0d35155df72f7dcff864692c8378329377875ce2ab3655d695c78d"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
