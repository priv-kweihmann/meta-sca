SUMMARY = "A linter for YAML files. "
DESCRIPTION = "A linter for YAML files. "
HOMEPAGE = "https://github.com/adrienverge/yamllint"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

PYPI_PACKAGE = "yamllint"

DEPENDS += "${PYTHON_PN}-pyyaml-native \
            ${PYTHON_PN}-pathspec-native"

inherit native
inherit pypi

SRC_URI += "file://yamllint.sca.description \
            file://yamllint.sca.score"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/yamllint.sca.description ${D}${datadir}
    install ${WORKDIR}/yamllint.sca.score ${D}${datadir}
}
