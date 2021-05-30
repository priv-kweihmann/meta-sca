SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.13.1.tgz"
SRC_URI[md5sum] = "0692b9ccdd793f455afe81213444f1a1"
SRC_URI[sha256sum] = "f8329852ed945c9824ee02e88c83eb5006282dc0f06ef550e6b96c88aa6d9f38"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
