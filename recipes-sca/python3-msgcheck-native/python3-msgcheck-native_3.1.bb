SUMMARY = "Gettext file checker"
HOMEPAGE = "https://github.com/flashcode/msgcheck"

LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c678957b0c8e964aa6c70fd77641a71e"

DEPENDS += "python3-pyenchant-native"

SRC_URI = "git://github.com/flashcode/msgcheck.git;protocol=https \
           file://msgcheck.sca.description"
SRCREV = "08eb80622a5dedf4739c3942b3c22e7ed33d3507"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/msgcheck.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
