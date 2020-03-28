FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://xmllint.sca.description"

FILES_${PN} += "${datadir}"

inherit sca-sanity

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/xmllint.sca.description ${D}${datadir}
}
