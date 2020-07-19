SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "\
            ${PYTHON_PN}-pathspec-native \
            ${PYTHON_PN}-pyyaml-native \
           "

SRC_URI_append = " file://yamllint.sca.description"
SRC_URI[md5sum] = "abe4707043d3f4327400dde67165e6da"
SRC_URI[sha256sum] = "40b68de6bacdccec1585dbd54072731b10da7fc2f9cfd96517a71f066208b61f"

PYPI_PACKAGE = "yamllint"

inherit native
inherit pypi
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/yamllint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
