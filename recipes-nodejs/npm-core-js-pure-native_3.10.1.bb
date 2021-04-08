SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.10.1.tgz"
SRC_URI[md5sum] = "e08372da73546baa6c5b3ca5f65326cb"
SRC_URI[sha256sum] = "8513a423b54516bffb10ea1c9aad9713b222a6af1dcb564a423ce65c265a8f59"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
