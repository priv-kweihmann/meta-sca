SUMMARY = "Bad ansible testcode"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

SRC_URI = "file://1.yaml;subdir=source"

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

SCA_SCORE_SECURITY_ERROR = "0"
SCA_SCORE_FUNCTIONAL_ERROR = "0"
SCA_SCORE_STYLE_ERROR = "0"
inherit sca

do_install() {
    install -d ${D}${datadir}
    install -m 0644 ${S}/1.yaml ${D}${datadir}
}

FILES:${PN} += "${datadir}"
