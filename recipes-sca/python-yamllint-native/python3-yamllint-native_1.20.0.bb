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
inherit sca-sanity
inherit setuptools3

SRC_URI += "file://yamllint.sca.description"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/yamllint.sca.description ${D}${datadir}
}

SRC_URI[md5sum] = "1eac23ef9cc20d3d450abb29072e27e2"
SRC_URI[sha256sum] = "76912b6262fd7e0815d7b14c4c2bb2642c754d0aa38f2d3e4b4e21c77872a3bf"
