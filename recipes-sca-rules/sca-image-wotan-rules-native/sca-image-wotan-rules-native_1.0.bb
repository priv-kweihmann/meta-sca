SUMMARY = "SCA ruleset for wotan at images"
DESCRIPTION = "Rules to configure how wotan is affecting the build"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://fatal \
           file://suppress"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/suppress" "${D}${datadir}/wotan-image-suppress"
    install "${WORKDIR}/fatal" "${D}${datadir}/wotan-image-fatal"
}

FILES:${PN} = "${datadir}"
