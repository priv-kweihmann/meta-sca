SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "\
            ${PYTHON_PN}-pathspec-native \
            ${PYTHON_PN}-pyyaml-native \
           "

SRC_URI_append = " file://yamllint.sca.description"
SRC_URI[md5sum] = "65812866d52fc64fdec7e13c1c77b6a4"
SRC_URI[sha256sum] = "7e1e698b3d344b64bc46cbe8c4df7dfdfe7c00ed1a8d1c851ecd5b552d93d193"

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
