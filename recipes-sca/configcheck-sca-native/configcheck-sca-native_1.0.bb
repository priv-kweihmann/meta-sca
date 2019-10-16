SUMMARY = "SCA description for configcheck"

SRC_URI = "file://configcheck.sca.description \
           file://configcheck.sca.score"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

inherit native

FILES_${PN} = "${datadir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/configcheck.sca.description ${D}${datadir}/
    install ${WORKDIR}/configcheck.sca.score ${D}${datadir}/
}

