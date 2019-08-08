SUMMARY = "SCA description for govet"

SRC_URI = "file://govet.sca.description \
           file://govet.sca.score"

LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

inherit native

FILES_${PN} = "${datadir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

DEPENDS += "go-native"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/govet.sca.description ${D}${datadir}/
    install ${WORKDIR}/govet.sca.score ${D}${datadir}/
}

