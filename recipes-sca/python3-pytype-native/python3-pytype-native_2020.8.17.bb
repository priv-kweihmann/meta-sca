SUMMARY = "Python type inferencer"
HOMEPAGE = "https://google.github.io/pytype/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a2cfaba162d74b289e2cac209dfa88"

DEPENDS += "\
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-importlab-native \
            ${PYTHON_PN}-pylint-native \
            ${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-scikit-build-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-typed-ast-native \
            cmake-native \
            ninja-native \
            "

SRC_URI_append = " file://pytype.sca.description"
SRC_URI[md5sum] = "241545a5477299a379d00632f3581ab6"
SRC_URI[sha256sum] = "8c6f91da370194f48844ef1e7c9427e95150879fce2017407f8c415bc333f139"

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
