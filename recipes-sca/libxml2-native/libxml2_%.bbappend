FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append_class-native = " file://xmllint.sca.description"

inherit sca-description

do_install_append_class-native() {
    install -d ${D}${datadir}
    install ${WORKDIR}/xmllint.sca.description ${D}${datadir}
}

FILES_${PN}_class-native += "${datadir}"

BBCLASSEXTEND += "native"
