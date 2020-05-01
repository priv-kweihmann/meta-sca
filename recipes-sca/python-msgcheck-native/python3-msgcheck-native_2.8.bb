SUMMARY = "Gettext file checker"
HOMEPAGE = "https://github.com/codingjoe/msgcheck"

LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "${PYTHON_PN}-pyenchant-native"

SRC_URI = "git://github.com/codingjoe/msgcheck.git;protocol=https \
           file://msgcheck.sca.description"
SRCREV = "1c8809e4babf387256bc74e9d25fa634561ddd1e"
S = "${WORKDIR}/git"

inherit native
inherit sca-sanity
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/msgcheck.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
