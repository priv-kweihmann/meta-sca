SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "\
            python3-pathspec-native \
            python3-pyyaml-native \
           "

SRC_URI:append = " file://yamllint.sca.description"
SRC_URI[md5sum] = "9207eb285913d2b859049f27ee60cf2c"
SRC_URI[sha256sum] = "0b08a96750248fdf21f1e8193cb7787554ef75ed57b27f621cd6b3bf09af11a1"

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
