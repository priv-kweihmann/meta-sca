SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=33e8b86a084578431a31c72608f226b8"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.6.0.tgz"
SRC_URI[md5sum] = "d59aed48e4fa323689df413f4cc743f2"
SRC_URI[sha256sum] = "08fedb0c79cc704893b8971b622683877b99c164c11c7a618c3c2829105bb8e3"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
