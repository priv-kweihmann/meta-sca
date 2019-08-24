SUMMARY = "Ruleset for ikos"
DESCRIPTION = " Rules to configure how ikos is affecting the build"

SRC_URI = "file://suppress \
           file://fatal"

LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/ikos-recipe-fatal"
    install "${WORKDIR}/suppress" "${D}${datadir}/ikos-recipe-suppress"
}

FILES_${PN} = "${datadir}/**"