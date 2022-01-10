SUMMARY = "C Bounded Model Checker"
HOMEPAGE = "https://github.com/diffblue/cbmc"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-4-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3326e2b1998e90a97f31e58341552600"

DEPENDS += "\
            bison-native \
            ninja-native \
           "

SRC_URI = "git://github.com/diffblue/cbmc.git;protocol=https;branch=develop \
           file://0001-diable-goto-gcc-regression-tests.patch"

SRCREV = "b79bd515ca20259287602abd68d5a32c276dbdd9"

UPSTREAM_CHECK_GITTAGREGEX = "cbmc-(?P<pver>[\d\.a-f]+)"

S = "${WORKDIR}/git"

inherit cmake
inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "cbmc"

EXTRA_OECMAKE += "-DWITH_JBMC=OFF -DWITH_MEMORY_ANALYZER=ON"
CXXFLAGS += "-Wno-error=maybe-uninitialized"

do_install() {
    install -d ${D}${datadir}
    install -d ${D}${bindir}

    for item in ${B}/bin/*; do
        install -m 0755 $item ${D}/${bindir}/$(basename $item)
    done
}
