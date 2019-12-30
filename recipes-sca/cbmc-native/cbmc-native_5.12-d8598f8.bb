SUMMARY = "C Bounded Model Checker"

SRC_URI = "git://github.com/diffblue/cbmc.git;protocol=https;branch=develop;tag=cbmc-${PV} \
           file://cbmc.sca.description"

LIC_FILES_CHKSUM = "file://LICENSE;md5=3326e2b1998e90a97f31e58341552600"

HOMEPAGE = "https://github.com/diffblue/cbmc"
LICENSE = "BSD-3-Clause"

DEPENDS += "\
            bison-native \
            ninja-native \
            "

S = "${WORKDIR}/git"

inherit cmake
inherit native
inherit sca-sanity

EXTRA_OECMAKE += "-DWITH_JBMC=OFF -DWITH_MEMORY_ANALYZER=ON"
CXXFLAGS += "-Wno-error=maybe-uninitialized"
FILES_${PN} += "${bindir} ${datadir}"

do_install() {
    install -d ${D}${datadir}
    install -d ${D}${bindir}

    for item in ${B}/bin/*; do
        install -m 0755 $item ${D}/${bindir}/$(basename $item)
    done

    install ${WORKDIR}/cbmc.sca.description ${D}${datadir}
}
