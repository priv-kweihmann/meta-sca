SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "\
            ${PYTHON_PN}-pathspec-native \
            ${PYTHON_PN}-pyyaml-native \
           "

SRC_URI_append = " file://yamllint.sca.description"
SRC_URI[md5sum] = "16766151cfad99676e2f221648187a29"
SRC_URI[sha256sum] = "59f3ff77f44e7f46be6aecdb985830f73a1c51e290b7082a7d38c2ae1940f4a9"

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
