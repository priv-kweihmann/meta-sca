SUMMARY = "NPM: core-js-pure"
DESCRIPTION = "Standard library"
HOMEPAGE = "https://github.com/zloirock/core-js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ef7af8b9d7db144cf9cd7c58bd6ba553"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/core-js-pure/-/core-js-pure-3.18.2.tgz"
SRC_URI[md5sum] = "db80b6aec44730c27db3c646cb012176"
SRC_URI[sha256sum] = "1ef79c7034bee19cb7cd63a17148da79e9915625f0325d9e1dab61f94544704d"

NPM_PKGNAME = "core-js-pure"

inherit npmhelper
inherit native
