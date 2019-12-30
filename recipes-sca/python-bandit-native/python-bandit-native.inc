SUMMARY = "Bandit is a tool designed to find common security issues in Python code."
DESCRIPTION = "Bandit is a tool designed to find common security issues in Python code."
HOMEPAGE = "https://github.com/PyCQA/bandit"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-stevedore-native ${PYTHON_PN}-gitpython-native \
            ${PYTHON_PN}-six-native ${PYTHON_PN}-pyyaml-native"

PYPI_PACKAGE = "bandit"

inherit native
inherit pypi
inherit sca-sanity

SRC_URI += "file://bandit.sca.description"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/bandit.sca.description ${D}${datadir}
}
