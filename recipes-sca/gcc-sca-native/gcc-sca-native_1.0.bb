SUMMARY = "SCA description for gcc"

SRC_URI = "file://gcc.sca.description \
           file://gcc.sca.score"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

inherit native

FILES_${PN} = "${datadir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/gcc.sca.description ${D}${datadir}/
    install ${WORKDIR}/gcc.sca.score ${D}${datadir}/
}

