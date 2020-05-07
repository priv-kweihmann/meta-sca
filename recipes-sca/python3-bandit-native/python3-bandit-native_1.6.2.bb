SUMMARY = "Bandit is a tool designed to find common security issues in Python code"
HOMEPAGE = "https://github.com/PyCQA/bandit"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

DEPENDS += "\
            ${PYTHON_PN}-gitpython-native \
            ${PYTHON_PN}-native \
            ${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-stevedore-native \
           "

SRC_URI_append = " file://bandit.sca.description"

SRC_URI[md5sum] = "c6a6772d7afa0af8828b3384e73b7085"
SRC_URI[sha256sum] = "41e75315853507aa145d62a78a2a6c5e3240fe14ee7c601459d0df9418196065"

PYPI_PACKAGE = "bandit"

inherit native
inherit pypi
inherit sca-sanity
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/bandit.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
