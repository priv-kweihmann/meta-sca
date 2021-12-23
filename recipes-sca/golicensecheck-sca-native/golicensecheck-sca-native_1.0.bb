SUMMARY = "SCA description for golicensecheck"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
    github.com-go-enry-go-license-detector-v4-native \
    licensecheck-helper-native \
"

SRC_URI = "file://golicensecheck.sca.description"

inherit sca-description
inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/golicensecheck.sca.description ${D}${datadir}/
}

FILES:${PN} = "${datadir}"
