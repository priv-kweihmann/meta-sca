SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "\
            python3-pathspec-native \
            python3-pyyaml-native \
           "

SRC_URI_append = " file://yamllint.sca.description"
SRC_URI[md5sum] = "644b4658ce34dce545f01a4169a0604d"
SRC_URI[sha256sum] = "87d9462b3ed7e9dfa19caa177f7a77cd9888b3dc4044447d6ae0ab233bcd1324"

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
