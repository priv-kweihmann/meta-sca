SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.16.2.tgz"
SRC_URI[md5sum] = "0cd6947bf34d9fa3ee61cac4f594baea"
SRC_URI[sha256sum] = "3e36ed303d57a38ffc99ad6ea890416fdf2ec7e53a9fe82928fa74436f1acd4e"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
