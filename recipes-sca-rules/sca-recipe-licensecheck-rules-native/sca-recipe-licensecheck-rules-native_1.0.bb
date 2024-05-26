SUMMARY = "SCA ruleset for licensecheck at recipes"
DESCRIPTION = "Rules to configure how licensecheck is affecting the build"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://fatal;destsuffix=${BP} \
           file://suppress"

inherit_defer native

UNPACKDIR ??= "${WORKDIR}/${BP}"
do_install() {
    install -d "${D}${datadir}"
    install "${UNPACKDIR}/suppress" "${D}${datadir}/licensecheck-recipe-suppress"
    install "${UNPACKDIR}/fatal" "${D}${datadir}/licensecheck-recipe-fatal"
}

FILES:${PN} = "${datadir}"
