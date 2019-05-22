SUMMARY = "simple python ast consumer which searches for common SQL injection attacks"
DESCRIPTION = "simple python ast consumer which searches for common SQL injection attacks"
HOMEPAGE = "https://github.com/uber/py-find-injection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "${PYTHON_PN}-native"

PYPI_PACKAGE = "py-find-injection"

inherit pypi

FILES_${PN} += "${datadir}"
SRC_URI += "file://pyfindinjection.sca.description \
            file://pyfindinjection.sca.score"

inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pyfindinjection.sca.description ${D}${datadir}
    install ${WORKDIR}/pyfindinjection.sca.score ${D}${datadir}
}