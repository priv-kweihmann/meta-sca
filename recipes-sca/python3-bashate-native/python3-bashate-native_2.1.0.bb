SUMMARY = "A pep8 equivalent for bash scripts"
HOMEPAGE = "http://docs.openstack.org/developer/bashate/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

DEPENDS += "\
            python3-babel-native \
            python3-native \
            python3-pbr-native \
           "

SRC_URI:append = " file://bashate.sca.description"
SRC_URI[md5sum] = "e910cde1c80a2518eec647a6110bae2e"
SRC_URI[sha256sum] = "a0df143639715dc2fb6cf9aa6907e4a372d6f0a43afeffc55c5fb3ecfe3523c8"

PYPI_PACKAGE = "bashate"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/bashate.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
