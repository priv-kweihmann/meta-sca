SUMMARY = "Ruleset for vulture"
DESCRIPTION = " Rules to configure how vulture is affecting the build"

SRC_URI = "file://fatal"

LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/fatal" "${D}${datadir}/vulture-image-fatal"
}

FILES_${PN} = "${datadir}/**"