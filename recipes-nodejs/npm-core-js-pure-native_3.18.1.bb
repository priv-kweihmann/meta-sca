SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.18.1.tgz"
SRC_URI[md5sum] = "a854c5d8ae7c1fc31cd96fa069809eda"
SRC_URI[sha256sum] = "35465eb3ceb0d4fb05332f4666dd1b400f0b7c9522b59f47e1fc7d55bb9ec6d0"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
