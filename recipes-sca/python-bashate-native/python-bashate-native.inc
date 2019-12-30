SUMMARY = "A pep8 equivalent for bash scripts"
DESCRIPTION = "A pep8 equivalent for bash scripts"
HOMEPAGE = "http://docs.openstack.org/developer/bashate/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

DEPENDS += "${PYTHON_PN}-native \
            ${PYTHON_PN}-pbr-native \
            ${PYTHON_PN}-babel-native"

PYPI_PACKAGE = "bashate"

inherit pypi
inherit sca-sanity

FILES_${PN} += "${datadir}"
SRC_URI += "file://bashate.sca.description"

inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/bashate.sca.description ${D}${datadir}
}