SUMMARY = "Calculate code metrics in various languages"
HOMEPAGE = "https://github.com/priv-kweihmann/multimetric"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

DEPENDS += "\
            ${PYTHON_PN}-chardet-native \
            ${PYTHON_PN}-pygments-native \
            "

SRC_URI += "\
            git://github.com/priv-kweihmann/multimetric.git;protocol=https;branch=master \
            file://multimetric.sca.description \
           "
SRCREV = "e585a25de518e860c8d932dcfd20683bfad7e686"
S = "${WORKDIR}/git"

inherit native
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/multimetric.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
