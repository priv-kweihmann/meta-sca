SUMMARY = "SCA description for clang"

SRC_URI = "file://clang.sca.description \
           file://clang.sca.score"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

inherit native
inherit sca-sanity

FILES_${PN} = "${datadir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

DEPENDS += "clang-native"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/clang.sca.description ${D}${datadir}/
    install ${WORKDIR}/clang.sca.score ${D}${datadir}/
}

