SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.9.1.tgz"
SRC_URI[md5sum] = "dd74e87f39954f27770201f45e878122"
SRC_URI[sha256sum] = "cddda20780d4c866a3ffc019673873b9f22e7ac36d724dc2f8a79069285f6a5d"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
