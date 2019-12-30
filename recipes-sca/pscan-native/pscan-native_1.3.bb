SUMMARY = "A limited problem scanner for C source files"

HOMEPAGE = "http://deployingradius.com/pscan/"
LICENSE = "GPL-2.0"

SRC_URI = "\
            file://src/COPYING \
            file://src/README \
            file://src/pscan.c \
            file://src/pscan.h \
            file://pscan.sca.description \
            file://src/scanner.l \
            file://src/Makefile \
        "

S = "${WORKDIR}/src"
B = "${S}"

DEPENDS += "flex-native"

LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

inherit native
inherit sca-sanity

FILES_${PN} = "${bindir} ${datadir}"

do_configure() {
    :
}

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/pscan ${D}${bindir}
    install -d ${D}${datadir}
    install ${WORKDIR}/pscan.sca.description ${D}${datadir}
}
