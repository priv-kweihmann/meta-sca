SUMMARY = "Python type inferencer"
DESCRIPTION = "Python type inferencer"
HOMEPAGE = "https://google.github.io/pytype/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a2cfaba162d74b289e2cac209dfa88"

PYPI_PACKAGE = "pytype"

DEPENDS += "${PYTHON_PN}-six-native \
            ${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-ninja-native \
            ${PYTHON_PN}-importlab-native \
            ${PYTHON_PN}-scikit-build-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-wheel-native \
            cmake-native"

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

SRC_URI[md5sum] = "907f9abeb39683d634f54bdc01992f17"
SRC_URI[sha256sum] = "b22aaf5dd125134cad2cb3f45231c2fd4aa158b129bff81f880a0c6d6bb3c2a8"
