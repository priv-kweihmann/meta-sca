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

SRC_URI[md5sum] = "9116d44eba4ae9d3bd9d0c49ce4c0b6c"
SRC_URI[sha256sum] = "8f25759997acb42e52b96bf3af0b4b942e6516b51198bebd3402640102006af7"
