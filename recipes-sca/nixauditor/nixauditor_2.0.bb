SUMMARY = "The Unix security audit and intrusion detection tool"

LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/files/licenses/Unlicense;md5=1d267ceb3a8d8f75f1be3011ee4cbf53"

SRC_URI = "git://github.com/XalfiE/Nix-Auditor.git;protocol=https;tag=${PV} \
           file://nixauditor.sca.description"

S = "${WORKDIR}/git"

inherit sca-sanity

do_install_class-target() {
    install -d ${D}${bindir}
    install -m 0755 "${S}/nixauditor 2.0" ${D}${bindir}/nixauditor
}

do_install_class-native () {
    install -d ${D}/${datadir}
    install ${WORKDIR}/nixauditor.sca.description ${D}${datadir}
}

FILES_${PN}_class-target = "${bindir}"
FILES_${PN}_class-native = "${datadir}"

RDEPENDS_${PN}_class-target += "bash"

BBCLASSEXTEND = "native"
