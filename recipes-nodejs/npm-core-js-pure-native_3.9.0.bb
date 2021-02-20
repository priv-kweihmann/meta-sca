SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.9.0.tgz"
SRC_URI[md5sum] = "a00515f2e8fb24d643b0915a129b67b2"
SRC_URI[sha256sum] = "ea4fe98264ceee89f99c0a2b428f701de06d72c8eab3747fb407dbdff2535fad"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
