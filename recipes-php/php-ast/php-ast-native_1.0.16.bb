SUMMARY = "Extension exposing PHP 7 abstract syntax tree"
HOMEPAGE = "https://github.com/nikic/php-ast"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5c6446acfd7f3170fa312948076b516"

DEPENDS += "php-native"

SRC_URI = "git://github.com/nikic/php-ast.git;branch=master;protocol=https"
SRCREV = "8f1e75f66e4d1746c11cf4d96a68181a6e8ff693"

S = "${WORKDIR}/git"

inherit autotools-brokensep
inherit native

do_configure:prepend() {
    phpize
}

do_install() {
    oe_runmake install INSTALL_ROOT=${D}
}

FILES:${PN} += "${libdir}/php*/extensions/*/*.so"
FILES:${PN}-dbg += "${libdir}/php*/extensions/*/.debug"
