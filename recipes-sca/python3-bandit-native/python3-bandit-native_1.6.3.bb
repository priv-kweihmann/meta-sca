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

SRC_URI[md5sum] = "da8b64541f9d82c03a7adef2b010b789"
SRC_URI[sha256sum] = "d02dfe250f4aa2d166c127ad81d192579e2bfcdb8501717c0e2005e35a6bcf60"

PYPI_PACKAGE = "bandit"

inherit native
inherit pypi
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/bandit.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
