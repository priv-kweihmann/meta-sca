FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append:class-native = " file://xmllint.sca.description"

inherit sca-description

do_install:append:class-native() {
    install -d ${D}${datadir}
    install ${WORKDIR}/xmllint.sca.description ${D}${datadir}
}

FILES:${PN}:class-native += "${datadir}"

BBCLASSEXTEND += "native"
