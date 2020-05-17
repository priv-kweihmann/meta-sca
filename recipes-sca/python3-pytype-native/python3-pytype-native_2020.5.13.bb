SUMMARY = "Python type inferencer"
HOMEPAGE = "https://google.github.io/pytype/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a2cfaba162d74b289e2cac209dfa88"

DEPENDS += "\
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-importlab-native \
            ${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-scikit-build-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-typed-ast-native \
            ${PYTHON_PN}-wheel-native \
            cmake-native \
            ninja-native \
            "

SRC_URI_append = " file://pytype.sca.description"
SRC_URI[md5sum] = "e9a2261c2707dea6c8cc89ca76d1ff72"
SRC_URI[sha256sum] = "e7c968c43df190f54a3ca82b09c026a41aba2d95164ff1ffe61c399bd0e216a5"

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
