SUMMARY = "SCA ruleset for gcc at recipes"
DESCRIPTION = "Rules to configure how gcc is affecting the build"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://suppress file://fatal"
S = "${UNPACKDIR}"

inherit_defer native

do_install() {
    install -d "${D}${datadir}"
    install "${S}/fatal" "${D}${datadir}/gcc-recipe-fatal"
    install "${S}/suppress" "${D}${datadir}/gcc-recipe-suppress"
}

FILES:${PN} = "${datadir}"
