SUMMARY = "Checks playbooks for practices and behaviour that could potentially be improved"
DESCRIPTION = "Checks playbooks for practices and behaviour that could potentially be improved"
HOMEPAGE = "https://github.com/ansible/ansible-lint"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27006a41205763794866943ed14d2493"

DEPENDS += "${PYTHON_PN}-native \
            ${PYTHON_PN}-ansible-native \
            ${PYTHON_PN}-ipaddress-native \
            ${PYTHON_PN}-enum34-native \
            ${PYTHON_PN}-pyasn1-native \
            ${PYTHON_PN}-pynacl-native \
            ${PYTHON_PN}-bcrypt-native \
            ${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-paramiko-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-ruamelyaml-native \
            ${PYTHON_PN}-cryptography-native \
            ${PYTHON_PN}-setuptools-scm-native \
            ${PYTHON_PN}-setuptools-scm-git-archive-native"

PYPI_PACKAGE = "ansible-lint"

inherit pypi
inherit sca-sanity

FILES_${PN} += "${datadir}"
SRC_URI += "file://ansiblelint.sca.description \
            file://ansiblelint.sca.score"

inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/ansiblelint.sca.description ${D}${datadir}
    install ${WORKDIR}/ansiblelint.sca.score ${D}${datadir}
}