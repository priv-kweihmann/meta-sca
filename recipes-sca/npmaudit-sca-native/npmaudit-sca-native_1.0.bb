SUMMARY = "SCA description for npmaudit"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "nodejs-native"

SRC_URI = "file://npmaudit.sca.description"

inherit sca-description
inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/npmaudit.sca.description ${D}${datadir}/
}

FILES_${PN} = "${datadir}"
