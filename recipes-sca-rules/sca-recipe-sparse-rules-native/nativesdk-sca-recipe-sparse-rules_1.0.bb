SUMMARY = "SCA ruleset for sparse at recipes"
DESCRIPTION = "Rules to configure how sparse is affecting the build"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://suppress;destsuffix=${BP}\
           file://fatal;destsuffix=${BP}"

inherit_defer nativesdk

UNPACKDIR ??= "${WORKDIR}/${BP}"
do_install() {
    install -d "${D}${datadir}"
    install "${UNPACKDIR}/fatal" "${D}${datadir}/sparse-recipe-fatal"
    install "${UNPACKDIR}/suppress" "${D}${datadir}/sparse-recipe-suppress"
}

FILES:${PN} = "${datadir}"
