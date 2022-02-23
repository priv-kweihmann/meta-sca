SUMMARY = "A limited problem scanner for C source files"
HOMEPAGE = "http://deployingradius.com/pscan/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS += "flex-native"

SRC_URI = "\
           file://src/COPYING \
           file://src/README \
           file://src/pscan.c \
           file://src/pscan.h \
           file://src/scanner.l \
           file://src/Makefile \
          "

S = "${WORKDIR}/src"

inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "pscan"

do_configure[noexec] = "1"

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/pscan ${D}${bindir}
}

FILES:${PN} += "${bindir}"
