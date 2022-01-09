SUMMARY = "SCA description for xmllint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "libxml2-native"

SRC_URI = "file://xmllint.sca.description"

inherit sca-description
inherit native

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/xmllint.sca.description ${D}${datadir}/
}

FILES:${PN} += "${datadir}"
