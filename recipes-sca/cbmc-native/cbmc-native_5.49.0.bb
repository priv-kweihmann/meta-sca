SUMMARY = "C Bounded Model Checker"
HOMEPAGE = "https://github.com/diffblue/cbmc"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-4-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3326e2b1998e90a97f31e58341552600"

DEPENDS += "\
            bison-native \
            ninja-native \
           "

MINISAT_VERSION = "2.2.1"

SRC_URI = "\
    git://github.com/diffblue/cbmc.git;protocol=https;branch=develop \
    file://0001-diable-goto-gcc-regression-tests.patch \
"

SRCREV = "be56e06fec5a2c51dfc6b74577086e83ee9a2b3b"
SRC_URI[minisat2.sha256sum] = "e54afa3c192c1753bc8075c0c7e126d5c495d9066e3f90a2588091149ac9ca40"

UPSTREAM_CHECK_GITTAGREGEX = "cbmc-(?P<pver>[\d\.a-f]+)"

S = "${WORKDIR}/git"

inherit cmake
inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "cbmc"

EXTRA_OECMAKE += "\
    -DWITH_JBMC=OFF \
    -DWITH_MEMORY_ANALYZER=ON \
    -Denable_cbmc_tests=OFF \
    -Dsat_impl=minisat2 \
"
CXXFLAGS += "-Wno-error=maybe-uninitialized"

# See https://github.com/diffblue/cbmc/issues/6582
do_configure[network] = "1"

do_install() {
    install -d ${D}${datadir}
    install -d ${D}${bindir}

    for item in ${B}/bin/*; do
        install -m 0755 $item ${D}/${bindir}/$(basename $item)
    done
}
