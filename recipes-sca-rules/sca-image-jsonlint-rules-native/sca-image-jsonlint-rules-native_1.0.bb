SUMMARY = "SCA ruleset for jsonlint at images"
DESCRIPTION = "Rules to configure how jsonlint is affecting the build"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://fatal"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/jsonlint-image-fatal"
}

FILES:${PN} = "${datadir}"
