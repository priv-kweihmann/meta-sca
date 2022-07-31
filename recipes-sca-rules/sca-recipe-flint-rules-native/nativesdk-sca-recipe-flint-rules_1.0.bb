SUMMARY = "SCA ruleset for flint++ at recipes"
DESCRIPTION = "Rules to configure how flint++ is affecting the build"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://suppress \
           file://fatal"

inherit nativesdk

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/flint-recipe-fatal"
    install "${WORKDIR}/suppress" "${D}${datadir}/flint-recipe-suppress"
}

FILES:${PN} = "${datadir}"
