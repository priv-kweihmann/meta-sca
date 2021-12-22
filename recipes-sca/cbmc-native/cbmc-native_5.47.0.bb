SUMMARY = "C Bounded Model Checker"
HOMEPAGE = "https://github.com/diffblue/cbmc"

DEFAULT_PREFERENCE = "-1"
LICENSE = "BSD-4-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3326e2b1998e90a97f31e58341552600"

DEPENDS += "\
            bison-native \
            ninja-native \
           "

SRC_URI = "git://github.com/diffblue/cbmc.git;protocol=https;branch=develop \
           file://0001-diable-goto-gcc-regression-tests.patch \
           file://cbmc.sca.description"

SRCREV = "95d8c91c4a5c7823bfb0caa35fc8ccfe03d21243"

UPSTREAM_CHECK_GITTAGREGEX = "cbmc-(?P<pver>[\d\.a-f]+)"

S = "${WORKDIR}/git"

inherit cmake
inherit sca-description
inherit native

EXTRA_OECMAKE += "-DWITH_JBMC=OFF -DWITH_MEMORY_ANALYZER=ON"
CXXFLAGS += "-Wno-error=maybe-uninitialized"
FILES:${PN} += "${datadir}"

do_install() {
    install -d ${D}${datadir}
    install -d ${D}${bindir}

    for item in ${B}/bin/*; do
        install -m 0755 $item ${D}/${bindir}/$(basename $item)
    done

    install ${WORKDIR}/cbmc.sca.description ${D}${datadir}
}
