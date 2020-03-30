SUMMARY = "Python type inferencer"
DESCRIPTION = "Python type inferencer"
HOMEPAGE = "https://google.github.io/pytype/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a2cfaba162d74b289e2cac209dfa88"

PYPI_PACKAGE = "pytype"

DEPENDS += "\
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-pyyaml-native \
            ninja-native \
            ${PYTHON_PN}-importlab-native \
            ${PYTHON_PN}-scikit-build-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-wheel-native \
            cmake-native \
            "

inherit native
inherit pypi
inherit sca-sanity
inherit setuptools3

SRC_URI += "file://pytype.sca.description"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pytype.sca.description ${D}${datadir}
}

SRC_URI[md5sum] = "4de8fab958614a755d243550235e67ab"
SRC_URI[sha256sum] = "53803f0f1fadf4923efc88a0bd0cfa4c242d2fa3f04421b6f8ab4d658ffd2b90"
