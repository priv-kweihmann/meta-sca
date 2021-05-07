SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.12.0.tgz"
SRC_URI[md5sum] = "ff171d035479c67bf900564ba60710a4"
SRC_URI[sha256sum] = "591d36782ed66771ff5f202de7b695d6c13cb346ee2c9c8268304c90ee57f2fc"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
