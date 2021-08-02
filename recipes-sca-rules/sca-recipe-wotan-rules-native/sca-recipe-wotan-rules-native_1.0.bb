SUMMARY = "SCA ruleset for wotan at recipes"
DESCRIPTION = "Rules to configure how wotan is affecting the build"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://suppress \
           file://fatal"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/wotan-recipe-fatal"
    install "${WORKDIR}/suppress" "${D}${datadir}/wotan-recipe-suppress"
}

FILES:${PN} = "${datadir}"
