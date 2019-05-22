FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://xmllint.sca.description \
            file://xmllint.sca.score"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/xmllint.sca.description ${D}${datadir}
    install ${WORKDIR}/xmllint.sca.score ${D}${datadir}
}