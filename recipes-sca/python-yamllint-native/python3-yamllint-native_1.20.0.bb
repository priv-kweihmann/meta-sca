SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "\
            ${PYTHON_PN}-pathspec-native \
            ${PYTHON_PN}-pyyaml-native \
           "

SRC_URI += "file://yamllint.sca.description"
SRC_URI[md5sum] = "1eac23ef9cc20d3d450abb29072e27e2"
SRC_URI[sha256sum] = "76912b6262fd7e0815d7b14c4c2bb2642c754d0aa38f2d3e4b4e21c77872a3bf"

PYPI_PACKAGE = "yamllint"

inherit native
inherit pypi
inherit sca-sanity
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/yamllint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
