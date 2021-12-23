SUMMARY = "SCA ruleset for nixauditor at images"
DESCRIPTION = "Rules to configure how nixauditor is affecting the build"

# Note: all rpm-based rules are suppressed by default

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://suppress \
           file://fatal"

inherit native

do_install() {
    install -d "${D}${datadir}"
    install "${WORKDIR}/suppress" "${D}${datadir}/nixauditor-image-suppress"
    install "${WORKDIR}/fatal" "${D}${datadir}/nixauditor-image-fatal"
}

FILES:${PN} = "${datadir}"
