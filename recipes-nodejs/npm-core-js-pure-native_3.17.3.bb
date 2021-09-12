SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.17.3.tgz"
SRC_URI[md5sum] = "ef394fd92f9831c2d20d0222fa15b052"
SRC_URI[sha256sum] = "4fde3f3f32d71f9b8974adcfbcaa3cc9bcda9d6261a92f87455d8175f8edd8a4"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
