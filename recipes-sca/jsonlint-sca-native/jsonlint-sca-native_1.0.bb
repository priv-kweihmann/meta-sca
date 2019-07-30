SUMMARY = "SCA description for json linter"

SRC_URI = "file://jsonlint.sca.description \
           file://jsonlint.sca.score"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file:///${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

inherit native

FILES_${PN} = "${datadir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/jsonlint.sca.description ${D}${datadir}/
    install ${WORKDIR}/jsonlint.sca.score ${D}${datadir}/
}

