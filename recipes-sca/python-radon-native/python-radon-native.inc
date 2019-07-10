SUMMARY = "Various code metrics for Python code"
DESCRIPTION = "Various code metrics for Python code"
HOMEPAGE = "https://github.com/rubik/radon"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4540bac589ba237d0f9238a399607ca"

SRC_URI += "file://radon.sca.description \
            file://radon.sca.score"

DEPENDS += "\
            ${PYTHON_PN}-colorama-native \
            ${PYTHON_PN}-flake8polyfill-native \
            ${PYTHON_PN}-future-native \
            ${PYTHON_PN}-mando-native \
            "

PYPI_PACKAGE = "radon"

FILES_${PN} += "${datadir}"

inherit pypi
inherit native

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/radon.sca.description ${D}${datadir}
    install ${WORKDIR}/radon.sca.score ${D}${datadir}
}
