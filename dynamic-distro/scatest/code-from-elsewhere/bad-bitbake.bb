SUMMARY = "Bad bitbake testcode"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

S="${WORKDIR}/source"
B = "${WORKDIR}/source"

do_configure() {
    bbwarn "This is an example warning"
}

SCA_SCORE_SECURITY_ERROR = "0"
SCA_SCORE_FUNCTIONAL_ERROR = "0"
SCA_SCORE_STYLE_ERROR = "0"

INSANE_SKIP:${PN} += "all"

IMAGE_FEATURES += "debug_tweaks"

inherit sca
