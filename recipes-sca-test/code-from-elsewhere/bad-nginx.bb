LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

SRC_URI = "file://nginx.conf;subdir=source"

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

FILES_${PN} += "${sysconfdir}"

do_install() {
    mkdir -p ${D}${sysconfdir}/nginx
    install -m 0644 ${WORKDIR}/source/nginx.conf ${D}${sysconfdir}/nginx/
}