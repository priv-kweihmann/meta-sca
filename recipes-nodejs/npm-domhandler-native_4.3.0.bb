SUMMARY = "NPM: domhandler"
DESCRIPTION = "Handler for htmlparser2 that turns pages into a dom"
HOMEPAGE = "https://github.com/fb55/domhandler#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-domelementtype-native"

SRC_URI = "https://registry.npmjs.org/domhandler/-/domhandler-4.3.0.tgz"
SRC_URI[md5sum] = "2bc1bfc4843b72779aa4f920c15fe370"
SRC_URI[sha256sum] = "db754eca19e1bad2d5ecb9ae95fdacc76e29c526a7be77f0d050bd04705af907"

NPM_PKGNAME = "domhandler"

inherit npmhelper
inherit native
