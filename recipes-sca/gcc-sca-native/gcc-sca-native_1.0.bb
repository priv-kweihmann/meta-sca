SUMMARY = "SCA description for gcc"

SRC_URI = "file://gcc.sca.description \
           file://gcc.sca.score"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

inherit native

FILES_${PN} = "${datadir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/gcc.sca.description ${D}${datadir}/
    install ${WORKDIR}/gcc.sca.score ${D}${datadir}/
}

