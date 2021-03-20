SUMMARY = "Linux system security checks"
DESCRIPTION = "script to check the properties of executables (like PIE, RELRO, PaX, Canaries, ASLR, Fortify Source)"
HOMEPAGE = "https://github.com/slimm609/checksec.sh"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8d90285f711cf1f378e2c024457066d8"

SRC_URI = "\
    git://github.com/slimm609/checksec.sh \
    file://checksec.sca.description \
"
SRCREV = "c3754e45e04f9104db93b2048afd094427102d48"

S = "${WORKDIR}/git"

inherit sca-description

do_install_class-target() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/checksec ${D}${bindir}
}

do_install_class-native () {
    install -d ${D}/${datadir}
    install ${WORKDIR}/checksec.sca.description ${D}${datadir}
}

RDEPENDS_${PN}_class-target += "\
    bash \
    binutils \
    file \
    openssl-bin \
"

FILES_${PN} += "${bindir}"
FILES_${PN}_class-native += "${datadir}"

BBCLASSEXTEND = "native"
