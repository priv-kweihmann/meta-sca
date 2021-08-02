SUMMARY = "sca definition for cspell"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "npm-cspell-native"

SRC_URI = "file://cspell.sca.description"

inherit sca-description
inherit native

do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/cspell.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
