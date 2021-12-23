SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "\
            python3-pathspec-native \
            python3-pyyaml-native \
           "

SRC_URI:append = " file://yamllint.sca.description"
SRC_URI[md5sum] = "751b2086411d1a21d37de4c90ac0844d"
SRC_URI[sha256sum] = "3934dcde484374596d6b52d8db412929a169f6d9e52e20f9ade5bf3523d9b96e"

PYPI_PACKAGE = "yamllint"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/yamllint.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
