SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.8.3.tgz"
SRC_URI[md5sum] = "20c8c6d00a63c663564df0ba42dcc801"
SRC_URI[sha256sum] = "76158e17f9a985c9dc04a4c75c6c0138878837e08053d8d78385d0869de8421f"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
