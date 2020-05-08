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
SRC_URI[md5sum] = "07ed3e92e15dadfd3043c5cc80aec379"
SRC_URI[sha256sum] = "a1619cee96ddbec535bde5af9a78182e6739883409c3be57373fa3a7bd3bc85f"

PYPI_PACKAGE = "pytype"

inherit native
inherit pypi
inherit sca-sanity
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
