SUMMARY = "SCA ruleset for secretlint at recipes"
DESCRIPTION = "Rules to configure how secretlint is affecting the build"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://fatal \
           file://suppress"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/suppress" "${D}${datadir}/secretlint-recipe-suppress"
    install "${WORKDIR}/fatal" "${D}${datadir}/secretlint-recipe-fatal"
}

FILES:${PN} = "${datadir}"
