SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "\
            python3-pathspec-native \
            python3-pyyaml-native \
           "

SRC_URI_append = " file://yamllint.sca.description"
SRC_URI[md5sum] = "fb1df16acc13a2de75931c84ea4ad915"
SRC_URI[sha256sum] = "b1549cbe5b47b6ba67bdeea31720f5c51431a4d0c076c1557952d841f7223519"

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
