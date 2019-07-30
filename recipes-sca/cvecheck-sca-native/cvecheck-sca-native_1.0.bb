SUMMARY = "SCA description for cvecheck"

SRC_URI = "file://cvecheck.sca.description \
           file://cvecheck.sca.score"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

inherit native

FILES_${PN} = "${datadir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/cvecheck.sca.description ${D}${datadir}/
    install ${WORKDIR}/cvecheck.sca.score ${D}${datadir}/
}

