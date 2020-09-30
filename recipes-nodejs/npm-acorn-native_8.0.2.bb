SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f6e380cb54b7b0b1b2f8428b190f4f73"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.0.2.tgz"
SRC_URI[md5sum] = "050c8713793745982bbf63c8e7300b39"
SRC_URI[sha256sum] = "8590482517d639eaf9ba7d4f881063a449817112ab5521d8802e935b7aec422f"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
