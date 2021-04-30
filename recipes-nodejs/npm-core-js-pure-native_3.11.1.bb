SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.11.1.tgz"
SRC_URI[md5sum] = "b1f497c02e3d102709add467426ce285"
SRC_URI[sha256sum] = "62217c8fa3a91f4a7de396974402a587ff33daad76e2f47ead0138ac9c83f016"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
