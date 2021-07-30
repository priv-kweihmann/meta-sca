SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.16.0.tgz"
SRC_URI[md5sum] = "583d6bf10befb33a3057a269c9037227"
SRC_URI[sha256sum] = "2a160d955fcbfd9f9ebd37a59584fc6dd3f496e44f6dabc2fc1a5873e263f32e"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
