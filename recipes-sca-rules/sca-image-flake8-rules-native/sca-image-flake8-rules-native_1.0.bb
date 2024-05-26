SUMMARY = "SCA ruleset for flake8 at images"
DESCRIPTION = "Rules to configure how flake8 is affecting the build"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://suppress;destsuffix=${BP}\
           file://fatal;destsuffix=${BP}"

inherit_defer native

UNPACKDIR ??= "${WORKDIR}/${BP}"
do_install() {
    install -d "${D}${datadir}"
    install "${UNPACKDIR}/fatal" "${D}${datadir}/flake8-image-fatal"
    install "${UNPACKDIR}/suppress" "${D}${datadir}/flake8-image-suppress"
}

FILES:${PN} = "${datadir}"
