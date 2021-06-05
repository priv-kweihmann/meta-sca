SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.14.0.tgz"
SRC_URI[md5sum] = "51a5819d784a6a6ea505e81cb462ca69"
SRC_URI[sha256sum] = "1888a073cd2456788392153eb3ee0fd545e2667fb19ff3512e92c4e94bc27974"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
