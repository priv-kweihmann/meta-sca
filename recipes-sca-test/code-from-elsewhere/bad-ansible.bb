LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

SRC_URI = "file://1.yaml;subdir=source"

S = "${WORKDIR}/source"
B = "${WORKDIR}/source"

SCA_SCORE_SECURITY_ERROR = "0"
SCA_SCORE_FUNCTIONAL_ERROR = "0"
SCA_SCORE_STYLE_ERROR = "0"
inherit sca
