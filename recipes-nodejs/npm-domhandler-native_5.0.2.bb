SUMMARY = "NPM: domhandler"
DESCRIPTION = "Handler for htmlparser2 that turns pages into a dom"
HOMEPAGE = "https://github.com/fb55/domhandler#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d5b9cb3bc7f6ffd7bea8661f30447c11"

DEPENDS = "npm-domelementtype-native"

SRC_URI = "https://registry.npmjs.org/domhandler/-/domhandler-5.0.2.tgz"
SRC_URI[md5sum] = "1428ab874c2c21d19e3e2abf50dae39b"
SRC_URI[sha256sum] = "467fae1851808cdd4480ea8a99f848464e6082bd4c6da00281e9ec30fc6ce465"

NPM_PKGNAME = "domhandler"

inherit npmhelper
inherit native
