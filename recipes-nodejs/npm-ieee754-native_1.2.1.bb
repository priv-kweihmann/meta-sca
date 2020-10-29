SUMMARY = "NPM: ieee754"
DESCRIPTION = "Read/write IEEE754 floating point numbers from/to a Buffer or array-like object"
HOMEPAGE = "https://github.com/feross/ieee754#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=56c3be003027d64d24ca6b69a2612f2f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ieee754/-/ieee754-1.2.1.tgz"
SRC_URI[md5sum] = "b8ee26cd9b7c7b20ea3f629b2cd8fdb5"
SRC_URI[sha256sum] = "8ef14b9b397e339db89db97881fb714f49319d8f0eb1275901f45567b28f9dac"

NPM_PKGNAME = "ieee754"

inherit npmhelper
inherit native
