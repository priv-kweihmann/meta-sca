SUMMARY = "NPM: charenc"
DESCRIPTION = "character encoding utilities"
HOMEPAGE = "https://github.com/pvorb/node-charenc#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.mkd;md5=b8024dcec94c3e11ece8465dd3c94c2a"

SRC_URI = "https://registry.npmjs.org/charenc/-/charenc-0.0.2.tgz"
SRC_URI[md5sum] = "40364d97dbbba31c369c5949d97ebd54"
SRC_URI[sha256sum] = "e36769a5316880df93e88212368f8987c8ef3f0f65b5de67d3fdf2ceefe1e89a"

NPM_PKGNAME = "charenc"

inherit npmhelper
inherit native
