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
SRCREV = "c3a7cb472d995ecfe4f1ee8f2b08cd8f26af7bde"
S = "${WORKDIR}/git"

inherit native
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/multimetric.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
