SUMMARY = "Run all SCA scripts in SDK"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://sca-runall"
S = "${UNPACKDIR}"

inherit_defer nativesdk

do_install() {
    install -d "${D}${bindir}"
    install -m 0755 "${S}/sca-runall" "${D}${bindir}"
}

FILES:${PN} = "${bindir}"
