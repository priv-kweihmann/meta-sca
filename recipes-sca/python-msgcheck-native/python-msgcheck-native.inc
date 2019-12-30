SUMMARY = "Gettext file checker"
HOMEPAGE = "https://github.com/codingjoe/msgcheck"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "${PYTHON_PN}-pyenchant-native"

FILES_${PN} += "${datadir}"
SRC_URI = "git://github.com/codingjoe/msgcheck.git;protocol=https;tag=${PV} \
           file://msgcheck.sca.description"

S = "${WORKDIR}/git"
inherit native
inherit sca-sanity

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/msgcheck.sca.description ${D}${datadir}
}