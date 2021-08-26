SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.16.3.tgz"
SRC_URI[md5sum] = "5e350ff58105052178c78187de830c05"
SRC_URI[sha256sum] = "adb5657ac342e02dccc6f088ab740858e1ebe9cac4d86340aa8adeec436ca34c"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
