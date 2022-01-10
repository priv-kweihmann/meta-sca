SUMMARY = "The Unix security audit and intrusion detection tool"
HOMEPAGE = "https://github.com/XalfiE/Nix-Auditor"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/files/licenses/Unlicense;md5=1d267ceb3a8d8f75f1be3011ee4cbf53"

SRC_URI = "git://github.com/XalfiE/Nix-Auditor.git;branch=master;protocol=https \
           file://nixauditor.sca.description"
SRCREV = "73b2a7d630f940a1c7bc13a51d628a7db136ec11"

S = "${WORKDIR}/git"

inherit sca-description

SCA_TOOL_DESCRIPTION = "nixauditor"

do_install:class-target() {
    install -d ${D}${bindir}
    install -m 0755 "${S}/nixauditor 2.0" ${D}${bindir}/nixauditor
}

FILES:${PN}:class-target = "${bindir}"

RDEPENDS:${PN}:class-target += "bash"

BBCLASSEXTEND = "native"
