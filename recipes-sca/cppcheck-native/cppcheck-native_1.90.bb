SUMMARY = "Static code analyzer for C/C++"
HOMEPAGE = "https://github.com/danmar/cppcheck"
BUGTRACKER = "https://trac.cppcheck.net/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "libpcre-native"

SRC_URI = "git://github.com/danmar/cppcheck.git;protocol=https;nobranch=1 \
           file://0001-Makefile-fixes.patch \
           file://cppcheck.sca.description"
SRCREV = "077e652de43ad962be0454d7be347816f7482739"

S = "${WORKDIR}/git"

inherit native
inherit pkgconfig
inherit sca-sanity

## we don't need debug packages
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

EXTRA_OEMAKE = "HAVE_RULES=yes"

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${datadir}
    install ${B}/cppcheck ${D}${bindir}
    cp -R ${B}/addons ${D}${bindir}
    cp -R ${B}/cfg ${D}${bindir}
    install -D ${B}/htmlreport/cppcheck-htmlreport ${D}${bindir}
    install ${WORKDIR}/cppcheck.sca.description ${D}${datadir}
}

FILES_${PN} = "${bindir} ${datadir}"
