SUMMARY = "Python type inferencer"
HOMEPAGE = "https://google.github.io/pytype/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a2cfaba162d74b289e2cac209dfa88"

DEPENDS += "\
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-importlab-native \
            ${PYTHON_PN}-ninja-native \
            ${PYTHON_PN}-pybind11-native \
            ${PYTHON_PN}-pylint-native \
            ${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-scikit-build-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-typed-ast-native \
            cmake-native \
            "

SRC_URI_append = " file://pytype.sca.description"
SRC_URI[md5sum] = "b12cdb976aaf086eaa3ab0f5404fa0b6"
SRC_URI[sha256sum] = "66f694abee3eea5a1c7f8ca040324f8b13b1ed01e308ba898bf36775b0a4c944"

PYPI_PACKAGE = "pytype"

inherit native
inherit pypi
inherit sca-description
inherit setuptools3

do_configure_prepend() {
    sed -i "/ninja/d" ${S}/setup.cfg
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pytype.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
