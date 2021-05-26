SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.13.0.tgz"
SRC_URI[md5sum] = "09ac2c6a342166c1bb682eae93c9cce8"
SRC_URI[sha256sum] = "e870d08f7e4ea65ddfccf0ab825ff57f90611857891f5db715691834b44092e3"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
