SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.15.1.tgz"
SRC_URI[md5sum] = "a1d98f397eb66bb7b31746f4c6870fd5"
SRC_URI[sha256sum] = "f07b5b5617cbb9acfd0cf3ae9073f73948ca9e44b401f25ccdee2598060189cb"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
