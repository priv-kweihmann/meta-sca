SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.10.0.tgz"
SRC_URI[md5sum] = "69aec73afcbba51ec4b941bbfe82d524"
SRC_URI[sha256sum] = "affcf27f74550f0dcbd628a8e6ad6312ecde5f168ac6f28f1420cdb38cc46fc4"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
