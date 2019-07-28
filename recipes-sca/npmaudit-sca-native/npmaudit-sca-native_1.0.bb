SUMMARY = "SCA description for npmaudit"

SRC_URI = "file://npmaudit.sca.description \
           file://npmaudit.sca.score"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

inherit native

FILES_${PN} = "${datadir}"

DEPENDS += "nodejs-native"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/npmaudit.sca.description ${D}${datadir}/
    install ${WORKDIR}/npmaudit.sca.score ${D}${datadir}/
}

