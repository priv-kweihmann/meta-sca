SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.18.0.tgz"
SRC_URI[md5sum] = "83a9f810d2850420db2c08942da94fcb"
SRC_URI[sha256sum] = "b61cc8e8002a3ad730afb72062e5675d22db04495bc57453866048e7344d4505"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
