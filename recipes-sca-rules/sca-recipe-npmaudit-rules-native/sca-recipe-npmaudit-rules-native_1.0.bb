SUMMARY = "Ruleset for npmaudit"
DESCRIPTION = " Rules to configure how npmaudit is affecting the build"
AUTHOR = "Konrad Weihmann <kweihmann@outlook.com>"

SRC_URI = "file://suppress \
           file://fatal"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/npmaudit-recipe-fatal"
    install "${WORKDIR}/suppress" "${D}${datadir}/npmaudit-recipe-suppress"
}

FILES_${PN} = "${datadir}/**"