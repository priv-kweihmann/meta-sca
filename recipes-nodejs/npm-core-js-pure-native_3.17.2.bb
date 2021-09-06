SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.17.2.tgz"
SRC_URI[md5sum] = "3ff1113615dc7c3efea98669b1851046"
SRC_URI[sha256sum] = "7d58fa3ee40e883817649fc9f62872ceffcb4fdcadb90448edec546e98e4a759"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
