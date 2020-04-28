SUMMARY = "Static analyzer for C/C++ based on the theory of Abstract Interpretation."
HOMEPAGE = "https://github.com/nasa-sw-vnv/ikos"

LICENSE = "NASA"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e59a2e7eca93bf552009706554bb526"

DEPENDS += "\
            boost-native \
            clang-native \
            gmp-native \
            python3-native \
            sqlite3-native \
            "

SRC_URI = "git://github.com/NASA-SW-VnV/ikos.git;protocol=https \
           file://ikos.sca.description"
SRCREV = "de3413927c8c84cf118fe42c98c624dc416ce756"

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
