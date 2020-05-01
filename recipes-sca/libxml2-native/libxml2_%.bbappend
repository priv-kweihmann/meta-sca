FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://xmllint.sca.description"

inherit sca-sanity
inherit sca-description

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/xmllint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"

BBCLASSEXTEND += "native"
