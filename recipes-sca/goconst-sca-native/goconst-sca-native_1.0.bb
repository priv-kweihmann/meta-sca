SUMMARY = "SCA description for goconst"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "github.com-jgautheron-goconst-native"

SRC_URI = "file://goconst.sca.description"

inherit sca-description
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/goconst.sca.description ${D}${datadir}/
}

FILES_${PN} += "${datadir}"
