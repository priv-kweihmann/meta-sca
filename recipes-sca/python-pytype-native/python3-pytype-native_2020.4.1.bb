SUMMARY = "Python type inferencer"
HOMEPAGE = "https://google.github.io/pytype/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a2cfaba162d74b289e2cac209dfa88"

DEPENDS += "\
            ${PYTHON_PN}-importlab-native \
            ${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-scikit-build-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-wheel-native \
            cmake-native \
            ninja-native \
            "

SRC_URI += "file://pytype.sca.description"
SRC_URI[md5sum] = "ea3d1762eedee16b28c2ad121368a805"
SRC_URI[sha256sum] = "d160eebdc43dade6f8ef699b91e4aa18a3f094fb87f272aeaffa73b0aed03459"

PYPI_PACKAGE = "pytype"

inherit native
inherit pypi
inherit sca-sanity
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pytype.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
