SUMMARY = "Bad nginx-config for testing"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://nginx.conf;subdir=source"

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

FILES:${PN} += "${sysconfdir}"

do_install() {
    mkdir -p ${D}${sysconfdir}/nginx
    install -m 0644 ${WORKDIR}/source/nginx.conf ${D}${sysconfdir}/nginx/
}
