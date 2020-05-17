SUMMARY = "NPM: ieee754"
DESCRIPTION = "Read/write IEEE754 floating point numbers from/to a Buffer or array-like object"
HOMEPAGE = "https://github.com/feross/ieee754#readme"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=56c3be003027d64d24ca6b69a2612f2f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ieee754/-/ieee754-1.1.13.tgz"
SRC_URI[md5sum] = "f5eac08883a5be859e119400e2b407f1"
SRC_URI[sha256sum] = "603e6b4c40da1551bbaabe8aa8a4b35f62f132b0b60e99906a59f0ad04d47ae2"

NPM_PKGNAME = "ieee754"

inherit npmhelper
inherit native
