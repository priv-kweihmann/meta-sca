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
    https://ftp.debian.org/debian/pool/main/m/minisat2/minisat2_${MINISAT_VERSION}.orig.tar.gz;name=minisat2;unpack=0 \
    file://0001-diable-goto-gcc-regression-tests.patch \
"

SRCREV = "5469136a4ca8307175dcbd76b796338928624f0f"
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

do_configure:prepend () {
    # make minisat2 visible to cmake implementation
    install -d ${B}/minisat2-download/minisat2-download-prefix/src/
    cp ${WORKDIR}/minisat2_${MINISAT_VERSION}.orig.tar.gz ${B}/minisat2-download/minisat2-download-prefix/src/
}

do_install() {
    install -d ${D}${datadir}
    install -d ${D}${bindir}

    for item in ${B}/bin/*; do
        install -m 0755 $item ${D}/${bindir}/$(basename $item)
    done
}
