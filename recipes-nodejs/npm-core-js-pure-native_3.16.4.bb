SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.16.4.tgz"
SRC_URI[md5sum] = "f98272d7980e0330da8d514245f69afe"
SRC_URI[sha256sum] = "95716146a8db9897eed32eac3fbda830b834ecbdcf603ae79f6ec3fe67da1129"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
