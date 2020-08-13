SUMMARY = "NPM: acorn"
DESCRIPTION = "ECMAScript parser"
HOMEPAGE = "https://github.com/acornjs/acorn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f6e380cb54b7b0b1b2f8428b190f4f73"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn/-/acorn-8.0.1.tgz"
SRC_URI[md5sum] = "b9e1638d9d0e05f03888dd02d65fb8b6"
SRC_URI[sha256sum] = "5db6fbf3e68ea44c92f519bb86cad680210bdfd1bed6dcd8ab63143346b36f75"

NPM_PKGNAME = "acorn"

inherit npmhelper
inherit native
