SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "\
            python3-pathspec-native \
            python3-pyyaml-native \
           "

SRC_URI_append = " file://yamllint.sca.description"
SRC_URI[md5sum] = "1c89ac1604bf93810ea16cf8da816138"
SRC_URI[sha256sum] = "b0e4c89985c7f5f8451c2eb8c67d804d10ac13a4abe031cbf49bdf3465d01087"

PYPI_PACKAGE = "yamllint"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/yamllint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
