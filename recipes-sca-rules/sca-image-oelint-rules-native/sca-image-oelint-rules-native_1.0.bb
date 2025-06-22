SUMMARY = "SCA ruleset for oelint at images"
DESCRIPTION = "Rules to configure how oelint is affecting the build"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://suppress file://fatal"
S = "${UNPACKDIR}"

inherit_defer native

do_install() {
    install -d "${D}${datadir}"
    install "${S}/suppress" "${D}${datadir}/oelint-image-suppress"
    install "${S}/fatal" "${D}${datadir}/oelint-image-fatal"
}

FILES:${PN} = "${datadir}"
