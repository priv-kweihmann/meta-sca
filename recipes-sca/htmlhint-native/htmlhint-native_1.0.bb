SUMMARY = "sca definition for htmlhint"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "npm-htmlhint-native"

SRC_URI = "file://htmlhint.sca.description"

inherit sca-description
inherit native

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/htmlhint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
