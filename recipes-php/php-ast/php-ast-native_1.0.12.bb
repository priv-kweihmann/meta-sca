SUMMARY = "Extension exposing PHP 7 abstract syntax tree"
HOMEPAGE = "https://github.com/nikic/php-ast"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5c6446acfd7f3170fa312948076b516"

DEPENDS += "php-native"

SRC_URI = "git://github.com/nikic/php-ast.git;protocol=https"
SRCREV = "dafc341c2b76f8cd9082fda081d4167c16eecb0c"

S = "${WORKDIR}/git"

inherit autotools-brokensep
inherit native

do_configure_prepend() {
    phpize
}

do_install() {
    oe_runmake install INSTALL_ROOT=${D}
}

FILES_${PN} += "${libdir}/php*/extensions/*/*.so"
FILES_${PN}-dbg += "${libdir}/php*/extensions/*/.debug"
