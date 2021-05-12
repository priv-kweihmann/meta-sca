SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.12.1.tgz"
SRC_URI[md5sum] = "c4468b77cffe79ffa3b070fcaaaaf703"
SRC_URI[sha256sum] = "16a305b39fc424251163574c9b4d805e4b412a842076fd10fc8255f9446fec13"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
