SUMMARY = "SCA ruleset for jsonlint at recipes"
DESCRIPTION = "Rules to configure how jsonlint is affecting the build"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://fatal"

inherit nativesdk

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/jsonlint-recipe-fatal"
}

FILES:${PN} = "${datadir}"
