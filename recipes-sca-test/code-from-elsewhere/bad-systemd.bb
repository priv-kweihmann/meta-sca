LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

SRC_URI = "file://bad.service;subdir=source"

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

FILES_${PN} += "${sysconfdir}"

do_install() {
    mkdir -p ${D}${sysconfdir}/systemd/system
    install -m 0644 ${WORKDIR}/source/bad.service ${D}${sysconfdir}/systemd/system
}