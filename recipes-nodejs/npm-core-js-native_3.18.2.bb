SUMMARY = "NPM: core-js"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js/-/core-js-3.18.2.tgz"
SRC_URI[md5sum] = "54267703d01d77af9e1311b6abefe145"
SRC_URI[sha256sum] = "3ed5b6fb439d834b0da017ffceb1f9e3c2a1012317f1310550c6d285051f76a6"

NPM_PKGNAME = "core-js"

inherit npmhelper
inherit native
