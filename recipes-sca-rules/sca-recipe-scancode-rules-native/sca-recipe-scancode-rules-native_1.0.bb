SUMMARY = "SCA ruleset for scancode at recipes"
DESCRIPTION = "Rules to configure how scancode is affecting the build"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://fatal \
           file://suppress"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/suppress" "${D}${datadir}/scancode-recipe-suppress"
    install "${WORKDIR}/fatal" "${D}${datadir}/scancode-recipe-fatal"
}

FILES:${PN} = "${datadir}"
