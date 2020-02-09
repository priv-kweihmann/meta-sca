SUMMARY = "Ansible roles"

SRC_URI = "file://ansibleroles.sca.description \
           "

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

inherit sca-sanity
inherit native

B = "${WORKDIR}"

FILES_${PN} = "${datadir}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${datadir}
    install ${WORKDIR}/ansibleroles.sca.description ${D}${datadir}/
}
