SUMMARY = "Bad systemd-service testcode"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://bad.service;subdir=source"

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

FILES:${PN} += "${sysconfdir}"

inherit sca

do_install() {
    mkdir -p ${D}${sysconfdir}/systemd/system
    install -m 0644 ${WORKDIR}/source/bad.service ${D}${sysconfdir}/systemd/system
}
