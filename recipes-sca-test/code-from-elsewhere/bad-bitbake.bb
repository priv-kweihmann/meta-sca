LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

S="${WORKDIR}"
B = "${WORKDIR}/source"

do_configure() {
    bbwarn "This is an example warning"
}

SCA_SCORE_SECURITY_ERROR = "0"
SCA_SCORE_FUNCTIONAL_ERROR = "0"
SCA_SCORE_STYLE_ERROR = "0"

INSANE_SKIP_${PN} += "all"

IMAGE_FEATURES += "debug_tweaks"

inherit sca