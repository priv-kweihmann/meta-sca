SUMMARY = "sca definition for wotan"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
            npm-fimbul-valtyr-native \
            npm-fimbul-ve-native \
            npm-fimbul-wotan-native \
            npm-typescript-native \
            "

SRC_URI = "file://wotan.sca.description"

inherit sca-description
inherit native

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/wotan.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
