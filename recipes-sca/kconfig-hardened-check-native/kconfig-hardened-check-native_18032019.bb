SUMMARY = "script for checking on linux kernel hardening"
HOMEPAGE = "https://github.com/a13xp0p0v/kconfig-hardened-check"

SRC_URI = "git://github.com/a13xp0p0v/kconfig-hardened-check.git;protocol=http;branch=master \
           file://kconfighard.sca.description"
SRCREV = "4d3138f62afa719ec5bf696ced214f7342d98dec"

S = "${WORKDIR}/git"
B = "${S}"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

inherit native

RDEPENDS_${PN} += "python3-core"
FILES_${PN} = "${bindir} ${datadir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    mkdir -p ${D}${bindir}/kconfig-hardening-check
    cp -R ${B}/* ${D}${bindir}/kconfig-hardening-check
    install -d ${D}${datadir}
    install ${WORKDIR}/kconfighard.sca.description ${D}${datadir}/
}
