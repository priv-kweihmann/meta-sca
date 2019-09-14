SUMMARY = "Ruleset for wotan"
DESCRIPTION = " Rules to configure how wotan is affecting the build"

SRC_URI = "file://fatal \
           file://suppress"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/suppress" "${D}${datadir}/wotan-image-suppress"
    install "${WORKDIR}/fatal" "${D}${datadir}/wotan-image-fatal"
}

FILES_${PN} = "${datadir}/**"