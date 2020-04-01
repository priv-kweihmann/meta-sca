SUMMARY = "Static analyzer for C/C++ based on the theory of Abstract Interpretation."
HOMEPAGE = "https://github.com/nasa-sw-vnv/ikos"

LICENSE = "NASA"
LIC_FILES_CHKSUM = "file://LICENSE.pdf;md5=8e66edc1c90b5c6d41e543011f1a09fc"

DEPENDS += "\
            boost-native \
            clang-native \
            gmp-native \
            python3-native \
            sqlite3-native \
            "

SRC_URI = "git://github.com/NASA-SW-VnV/ikos.git;protocol=https;tag=v${PV} \
           file://96c43af80b7d4d86463ab1cdbd69999d0f761f7e.patch \
           file://ikos.sca.description"

S = "${WORKDIR}/git"

inherit native
inherit cmake
inherit sca-sanity

EXTRA_OECMAKE += "\
                  -DBUILD_SHARED_LIBS=On \
                  -DIKOS_LINK_LLVM_DYLIB=On \
                 "

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/ikos.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
