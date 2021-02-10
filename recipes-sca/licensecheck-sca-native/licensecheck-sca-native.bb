SUMMARY = "Check license settings"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
            github.com-boyter-lc-native \
            licensecheck-helper-native \
            "

SRC_URI = "file://licensecheck.sca.description"

S = "${WORKDIR}"

inherit sca-description
inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/licensecheck.sca.description ${D}${datadir}/
}

FILES_${PN} = "${datadir}"
