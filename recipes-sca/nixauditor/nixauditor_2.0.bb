SUMMARY = "The Unix security audit and intrusion detection tool"
HOMEPAGE = "https://github.com/XalfiE/Nix-Auditor"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/files/licenses/Unlicense;md5=1d267ceb3a8d8f75f1be3011ee4cbf53"

SRC_URI = "git://github.com/XalfiE/Nix-Auditor.git;protocol=https \
           file://nixauditor.sca.description"
SRCREV = "73b2a7d630f940a1c7bc13a51d628a7db136ec11"

S = "${WORKDIR}/git"

inherit sca-description

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
